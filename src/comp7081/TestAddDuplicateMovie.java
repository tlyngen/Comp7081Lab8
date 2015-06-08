/**
 *
 */
package comp7081;

import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import comp7081.interfaces.IMovie;
import comp7081.interfaces.IMovieList;

/**
 * @author COMP7081 - Lab 8 - Group 2. kchan, msato, tlyngen
 *
 */

public class TestAddDuplicateMovie extends TestCase {
    private MovieList movieList;
    private Movie movie;
    
    @Before
    public void setUp() {
        movie = new Movie();
        movieList = new MovieList();
    }
    
    @Test
    public void testName() throws Exception {
        movie.setName("StarWars");
        assertEquals("Size of movie list should be 0.", 0, movieList.size());
        movieList.add(movie);
        assertEquals("Size of movie list should be 1.", 1, movieList.size());
        assertEquals("Cannot add duplicate movie.","FAIL", movieList.add(movie));
        assertEquals("Size of movie list should be 1.", 1, movieList.size());
        
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestAddDuplicateMovie.class);
    }
}

