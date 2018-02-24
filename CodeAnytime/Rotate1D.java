import java.util.*;
class Rotate1D {
	static void rotate(int[] array,int times)  {
		for(int x=0;x<times;x++) {
			int first=array[0];
			for(int i=1;i<array.length;i++)
				array[i-1]=array[i];
			array[array.length-1]=first;
		}
	}
	static void display(int[] array) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int[] input=new int[size];
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++)
			input[i]=s.nextInt();
		
		System.out.println("Enter the no of times to be rotated");
		int k=s.nextInt();
		System.out.println(size);
		System.out.println(k);
		k%=size;
		rotate(input,k);
		display(input);
	}
}