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

public class TestRenameMovieInList extends TestCase {
	 private MovieList movieList;
	 private Movie movie;
	 private Movie movie2;
	 
	 @Before
	 public void setUp() {
		 movie = new Movie();
		 movie2 = new Movie();
		 movieList = new MovieList();
	 }
	 
	 @Test
	 public void testName() throws Exception {
		movie.setName("StarWars");
		movie2.setName("StarWars3");
		movieList.add(movie);
		movieList.add(movie2);
		assertEquals("The name should be StarWars", "StarWars", movieList.getMovieName(0));
		assertEquals("Cannot rename movie to empty movie name.","FAIL", movieList.renameMovie(0, ""));
		assertEquals("Cannot rename movie to empty movie name.","FAIL", movieList.renameMovie(0, null));
		assertEquals("The name should be StarWars3","StarWars3", movieList.getMovieName(1));
		assertEquals("Cannot rename movie to existing movie name.","FAIL", movieList.renameMovie(0, "StarWars3"));
		movieList.renameMovie(0, "StarWars2");
		assertEquals("The name should be StarWars2","StarWars2", movieList.getMovieName(0));

	 }

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestRenameMovieInList.class);
	}
}

