package app;
/**
 * 
 */

/**
 * @author filip
 *
 */
public class SecretWord {
	private int _amountOfLetters;
	public SecretWord(int amountOfLetters) throws Exception {
		if(amountOfLetters <= 3){
			throw new Exception("Have to be more than 3");
		}
		_amountOfLetters = amountOfLetters;
	}

}
