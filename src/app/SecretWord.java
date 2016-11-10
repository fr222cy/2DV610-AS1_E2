package app;
/**
 * 
 */

/**
 * @author filip
 *
 */
public class SecretWord {

	public SecretWord(int num) throws Exception {
		if(num < 3){
			throw new Exception("Have to be more than 3");
		}
		
	}

}
