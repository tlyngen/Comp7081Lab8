/**
 * 
 */
package comp7081;

import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import comp7081.interfaces.IMovieList;

/**
 * @author COMP7081 - Lab 8 - Group 2. kchan, msato, tlyngen
 *
 */
public class TestEmptyMovieList extends TestCase {
	private IMovieList movieListMock;

	@Before
	public void setUp() {
		movieListMock = EasyMock.createMock(IMovieList.class);
	}

	@Test
	public void testEmptyListSize() {
		EasyMock.expect(movieListMock.size()).andReturn(0);
		EasyMock.replay(movieListMock);
		assertEquals("Size of empty movie list should be 0.", 0,
				movieListMock.size());
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestEmptyMovieList.class);
	}
}
