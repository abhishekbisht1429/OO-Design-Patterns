import java.util.*;
class Occurence {
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
	public static void main(String[] args) {
		System.out.println("Enter the no. of elements : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=s.nextInt();
		array=sort(array);
		int count=1;
		int temp=0;
		for(int i=0;i<n-1;i++) {
			temp=array[i];
			if((array[i]==array[i+1]))
				count++;
			else {
				if(count%2!=0)
					break;
				count=1;
			}
		}
		System.out.println(temp);
	}
}