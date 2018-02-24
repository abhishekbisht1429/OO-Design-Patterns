import java.util.*;
class Missing {
	static int[] sort(int[] array) {
		int temp=0;
		for(int i=0;i<array.length-1;i++) 
			for(int j=0;j<(array.length-i-1);j++)
			    if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
	            }
	
		return array;
	}
	static void display(int[] array){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=s.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the n-1 elements : ");
		for(int i=0;i<n-1;i++) {
			array[i]=s.nextInt();
		}
		array=sort(array);
		int output=0;
		for(int i=0;i<n-1;i++)
			if(array[i+1]!=array[i]+1)
				output= array[i]+1;
		System.out.println(output);
	}
}