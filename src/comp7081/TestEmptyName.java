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

public class TestEmptyName extends TestCase {
    //private IMovie movieMock;
    //private IMovieList movieListMock;
    private Movie movie;
    
    @Before
    public void setUp() {
        //movieMock = EasyMock.createMock(IMovie.class);
        //movieListMock = EasyMock.createMock(IMovieList.class);
        movie = new Movie();
        
    }
    
    @Test
    public void testName() {
        /*
         EasyMock.expect(movieListMock.add(movieMock)).andReturn("OK");
         EasyMock.expect(movieMock.setName("StarWars")).andReturn("OK");
         EasyMock.expect(movieMock.setName(null)).andThrow(new RuntimeException());
         EasyMock.expect(movieMock.setName("StarWars")).andReturn("OK");
         
         EasyMock.replay(movieMock);
         EasyMock.replay(movieListMock);
         
         assertEquals("Movie name cannot be empty.","FAIL", movieMock.setName(null));
         assertEquals("Movie name cannot be empty.","OK", movieMock.setName("StarWars"));
         */
        movie.setName("StarWars");
        assertEquals("Movie name cannot be empty.","FAIL", movie.setName(""));
        assertEquals("Movie name cannot be empty.","FAIL", movie.setName(null));
        assertEquals("Movie name cannot be empty.","OK", movie.setName("StarWars"));
        
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestEmptyName.class);
    }
}
