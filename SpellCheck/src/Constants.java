import java.util.regex.Pattern;

public final class Constants {

	public final String DEFAULT_DICTIONARY_FILE;
	public final Pattern UNWANTED_SYMBOLS;
	
	private Constants(){
		DEFAULT_DICTIONARY_FILE = "words.txt";
		UNWANTED_SYMBOLS = Pattern.compile("(?:--|[\\[\\]{}()+/\\\\])");
	}
	
	static Constants getConstant(){
		Constants constant = new Constants();
		return constant;
	}

}
