import java.util.*;
class Frequency3 {
	public static void main(String[] args) {
		int[] numbers=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements : ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
			numbers[s.nextInt()-1]++;
		for(int i=0;i<100;i++)
			if(numbers[i]!=0)
				System.out.println((i+1)+" : "+numbers[i]);
	}
}