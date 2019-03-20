
public final class Constants {

	public final String DEFAULT_DICTIONARY_FILE;
	
	private Constants(){
		DEFAULT_DICTIONARY_FILE = "words.txt";
	}
	
	static Constants getConstant(){
		Constants constant = new Constants();
		return constant;
	}

}
