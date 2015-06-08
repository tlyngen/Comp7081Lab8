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
	 private IMovie movieMock;
	 private IMovieList movieListMock;
	 
	 @Before
	 public void setUp() {
		 movieMock = EasyMock.createMock(IMovie.class);
		 movieListMock = EasyMock.createMock(IMovieList.class);
	 }
	 
	 @Test
	 public void testName() throws Exception {
		EasyMock.expect(movieListMock.add(movieMock)).andReturn("OK");
		EasyMock.expect(movieListMock.add(movieMock)).andThrow(new Exception("Duplicate movies not allowed"));
		EasyMock.replay(movieListMock);
		assertEquals("Cannot add duplicate movie.","FAIL", movieListMock.add(movieMock));
	 }

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestAddDuplicateMovie.class);
	}
}

