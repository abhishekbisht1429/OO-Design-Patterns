import java.util.*;
class Missingv2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=s.nextInt();
		int sum=0;
		System.out.println("Enter the n-1 elements : ");
		for(int i=0;i<n-1;i++) 
			sum+=s.nextInt();
		int total=(n*(n+1))/2;
		System.out.println("Missing no : "+(total-sum));
	}
}