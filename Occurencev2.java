import java.util.*;
class Occurencev2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=s.nextInt();
		for(int i=0;i<n-1;i++)
			temp=temp^(s.nextInt());
		System.out.println(temp);
	}
}