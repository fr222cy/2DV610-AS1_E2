/**
 * 
 */
package tests;
import app.SecretWord;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author filip
 *
 */
public class testSecretWord {


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructThreeLetters() throws Exception{
		try{
			SecretWord s = new SecretWord(3);
			fail();
		} catch(Exception e){
			
		}
	}
	
	@Test
	public void testConstructFourLetters() throws Exception{	
			SecretWord s = new SecretWord(4);
	}

}
