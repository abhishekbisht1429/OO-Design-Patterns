
import java.util.*;
class Palindrome {
	static String reverse(String input) {
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			output+=input.charAt(i);
		}
		return output;
	}
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
        String input=s.next();
        if(input.equalsIgnoreCase(reverse(input)))
            System.out.println("The string is Palindrome");
        else
            System.out.println("The String is not Palindrome");			
	}
}