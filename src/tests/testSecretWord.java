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
	public void testConstruct() throws Exception{
		SecretWord s = new SecretWord(2);
	}

}
