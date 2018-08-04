import java.util.ArrayList;

public class AnagramChecker {
	private String firstWord; // to store first string 
	private String secondWord;	// to store second string
	private boolean resultHolder = false;	// to store result 
	private ArrayList<Character> array1 = new ArrayList<Character>();	// to store character of first string
	private ArrayList<Character> array2 = new ArrayList<Character>();	// to store character of second string
	
	// Constructor 
	public AnagramChecker(String firstWord, String secondWord){
		this.firstWord = firstWord;
		this.secondWord = secondWord;
		this.firstWord = this.firstWord.toLowerCase();
		this.secondWord = this.secondWord.toLowerCase();
	}
		
	// to fill ArrayList with the characters of first string
	public void stringBreakDownArray1(){
		for(int i = 0; i < firstWord.length(); i++){
			array1.add(firstWord.charAt(i));
		}
	
	}	
	
	// to fill ArrayList with the character of second string
	public void stringBreakDownArray2(){
		for(int i = 0; i < secondWord.length(); i++){
			array2.add(secondWord.charAt(i));
		}
	}
	
	// to store if both Arrays are equal
	public void CheckingAnagram(){
		if(firstWord.length() == secondWord.length()){
			for(int i = 0; i < array1.size(); i++){
			if(array1.contains(array2.get(i))){
				resultHolder = true;
				}
			else{
				resultHolder = false;
				break;
				}
			}
			
		}
	}
	
	// to Check if the words are Anagram
	public void checkResult(){
		if(resultHolder)
			System.out.println("These words are Anagram. ");
		else
			System.out.println("These words are not Anagram. ");
	}
	
	// starting the process
	public void check(){
		stringBreakDownArray1();
		stringBreakDownArray2();
		CheckingAnagram();
		checkResult();
	}
}
