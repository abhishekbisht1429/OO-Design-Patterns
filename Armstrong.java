import java.util.*;
class Armstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int store=0;
		int temp=n;
		int size=0;
		while(temp>0) {
			size++;
			temp/=10;
		}
		temp=n;
		while(temp>0) {
			store+=Math.pow(temp%10,size);
			temp/=10;
		}
		if(store==n)
			System.out.println("amrstrong");
		else
			System.out.println("not");
	}
}