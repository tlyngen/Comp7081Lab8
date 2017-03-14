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
    private Movie movie;
    
    @Before
    public void setUp() {
        movie = new Movie();
        
    }
    
    @Test
    public void testName() {
        
        movie.setName("StarWars");
        assertEquals("Movie name cannot be empty.","FAIL", movie.setName(""));
        assertEquals("Movie name cannot be empty.","FAIL", movie.setName(null));
        assertEquals("Movie name cannot be empty.","OK", movie.setName("StarWars"));
        
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestEmptyName.class);
    }
}
