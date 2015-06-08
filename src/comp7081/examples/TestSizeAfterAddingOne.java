/**
 * 
 */
package comp7081.examples;

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
public class TestSizeAfterAddingOne extends TestCase {
	 private IMovieList movieListMock;
	 private IMovie movieMock;

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		movieListMock = EasyMock.createMock(IMovieList.class);
		movieMock = EasyMock.createMock(IMovie.class);
	}

	@Test
	public void testOneItemListSize() {
		EasyMock.expect(movieListMock.add(movieMock)).andReturn("OK");
		EasyMock.expect(movieListMock.size()).andReturn(1);
		EasyMock.replay(movieMock);
		EasyMock.replay(movieListMock);
		assertEquals("Add a movie to the list. Should get OK", "OK",
				movieListMock.add(movieMock));
		assertEquals("Size of movie list should be 1.", 1, movieListMock.size());
	}
	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestSizeAfterAddingOne.class);
	}

}
