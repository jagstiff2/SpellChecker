Assignment 6  - Java Collections

The purpose of this assignment is to give you some practice working with Java Collections (sets and maps)


Overview

In this assignment you will create a simple spell checker that lists all the words in a given file that are spelled incorrectly (making use of a set).  Then you’ll extend this program to count how many times each incorrectly spelled word appears (making use of a map).

To determine if a word is spelled correctly, it will be compared against the list of words in this provided word list.  If it’s not in that word list, it’s assumed to be spelled incorrectly.

Note: this is a fairly simple app (likely 1-4 functions and < 100 lines total), as the collection objects do all the heavy lifting. 


Part 1:  Spell Checker - Details

The application should be named SpellCheck (.java and .class)
Your application should accept 0-2 arguments
The first argument, if provided, will be the file to spellcheck.  If it’s not provided, prompt the user for the filename.
The 2nd argument, if provided, will be the dictionary file.  If not provided, use words.txt (aprox 350k words)
The name of the file being spell checked, as well as the dictionary file, should be printed to stdout.
Words in the input file will be whitespace delimited.  
ignore case (either do a case-insensitive compare or convert all words to lower case)
replace any non-alphabetic characters in each word with a blank
Note: This is not a perfect solution, but I’m OK with it for this assignment as I’m concerned more with your use of a collection then perfect spell-checking functionality.
Every misspelled word should should be printed to stdout. (in the order they’re found), one per line.
The total number of words checked, and the total number misspelled, should be printed to stdout.


Design Question:   Which of the collection object types listed below could you use to store your dictionary file?  And for each one, why is it, or is it not, appropriate?   Which one is probably the best, and why?

List
ArrayList
Vector
LinkedList

Set
HashSet
LinkedHashSet
TreeSet


Map
Hashtable
LinkedHashMap
TreeMap



Collections Tutorial: http://beginnersbook.com/java-collections-tutorials/


To test your program, I recommend you
Run it using small test files that have a known number of correct and misspelled words.
When that works, run it against the mobydick.txt file from this site, and post your results on the discussion board so they can be compared to others.


Part 2 - Misspelled word counter

Extend the program to count how many times each misspelled word occurs in the file, and print this count out to the right of each word, as follows:
	painnt (3)

The misspelled word list should be printed in alphabetical order.

Design Question: Which of the collection object type in the table above would you use to store your word counts? And for each one, why is it, or is it not, appropriate?   Which one is probably the best, and why?


Submittal instructions

Submit the following:
an executable .jar file containing all your .class and .java file (it’s unusual to put the .java files in the .jar file but it’s a convenient way for you to submit your source code).  
Main() must be in the SpellCheck.class, as programs will be run as follows:
java -jar SpellCheck.jar
