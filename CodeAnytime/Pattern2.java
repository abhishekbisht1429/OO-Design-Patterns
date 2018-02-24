import java.util.*;
class Pattern2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j);
			for(int j=2;j<=i;j++)
				System.out.print((j-1));
			System.out.println();
		}
	}
}