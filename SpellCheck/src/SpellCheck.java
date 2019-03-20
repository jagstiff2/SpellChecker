import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Assignment 6  - Java Collections

The purpose of this assignment is to give you some practice working with Java Collections (sets and maps)


Overview

In this assignment you will create a simple spell checker that lists all the words in a given file that are spelled incorrectly (making use of a set).  Then you’ll extend this program to count how many times each incorrectly spelled word appears (making use of a map).

To determine if a word is spelled correctly, it will be compared against the list of words in this provided word list.  If it’s not in that word list, it’s assumed to be spelled incorrectly.

Note: this is a fairly simple app (likely 1-4 functions and < 100 lines total), as the collection objects do all the heavy lifting. 

 */
public class SpellCheck {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args){
		File file2SpellCheck = null;
		try {
			File dictionaryFile = null;
			Scanner fsc;
			Map<String, Object> map = new HashMap<String, Object>();
			String line = null;
			String[] wordsArray;
			
			if(args.length == 0){
				System.out.println("Please enter the filename of the file to spellcheck.");
				String file2Read;
				Scanner S=new Scanner(System.in);
				file2Read=S.toString();
				file2SpellCheck = new File(file2Read);
				dictionaryFile = new File(Constants.getConstant().DEFAULT_DICTIONARY_FILE);
				System.out.println("File To Spellcheck: " + file2Read);
				System.out.println("Dictionary File: " + dictionaryFile);
				//check if valid user input
			}
			else if(args.length == 1){ 
				file2SpellCheck = new File(args[0]);
				dictionaryFile = new File(Constants.getConstant().DEFAULT_DICTIONARY_FILE);
				System.out.println("File To Spellcheck: " + args[0]);
				System.out.println("Dictionary File: " + dictionaryFile);
				//check if words.txt exists
			}
			else if(args.length > 1){
				file2SpellCheck = new File(args[0]);
				dictionaryFile = new File(args[1]);
				System.out.println("File To Spellcheck: " + args[0]);
				System.out.println("Dictionary File: " + args[1]);
				//check if valid input
				if (args.length > 2){
					System.out.println("Too many arguments. Format is as follows:");
					System.out.println("Executable fileToSpeckCheck dictionaryFile");
					System.out.println("Additional arguments will be ignored");
				}
			}
			
			fsc = new Scanner(dictionaryFile);
			while (fsc.hasNextLine()) {
				line = fsc.nextLine();
				// Check for the presence of a word
				wordsArray = line.split(" ");
				// Add a word
				for(int x = 0; x < wordsArray.length; x++) {
					map.put(wordsArray[x], null);
				}
			}
			fsc = new Scanner(file2SpellCheck);
			while(fsc.hasNextLine()) {
				line = fsc.nextLine();
				// Check for the presence of a word
				wordsArray = line.split(" ");
				// Add a word
				for(int x = 0; x < wordsArray.length; x++) {
					if(spellCheck(wordsArray[x], map)) {
						System.out.println(wordsArray[x] + "is misspelled");
					}
				}
			}
			fsc.close();
			
		}
		catch (FileNotFoundException e) {
			System.err.println("Error: " + file2SpellCheck.getAbsolutePath() + " not found.");
		}

	}

	private static boolean spellCheck(String word, Map<String, Object> map) {
		// Check for the presence of a word
		if(map.containsKey(word)) {
			return true;
		}
		return false;
	}
}
