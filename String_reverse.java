import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks a user to enter a word
		System.out.print("Enter a word >> ");
		String word = input.next();

		//Invokes a function to check if the word is a palindrome
		isPalindrome(word);
	}

	//Check if the word is a palindrome
	public static void isPalindrome(String w) {
		String isPalindrome = "Yes";

		for (int i = 0, j = w.length() - 1; i < w.length() / 2; i++, j--) {
			String a = w.substring(i, i+1);
			String b = w.substring(j, j+1);
			if (!(a.compareTo(b) == 0)) {
				isPalindrome = "No";
			}
		}

		System.out.println(isPalindrome);
	}
}