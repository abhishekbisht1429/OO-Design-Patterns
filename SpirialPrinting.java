import java.util.*;
class SpirialPrinting {
	static int[][] array;
	static int[][] output;
	static int i,j;
	static void printInArray(int data) {
		int m=output.length;
		int n=output[0].length;
		if(j==n) {
			j=0;
			i++;
		}
		output[i][j]=data;
		j++;
	}
	static void display(int[][] array) {
	    for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[0].length;j++)
                System.out.print(output[i][j]+" ");
            System.out.println();		
		}			
	}
	static void printSpirally(int[][] array) {
		int top,bottom,left,right;
		top=left=0;
		bottom=array.length-1;
		right=array[0].length-1;
		while((top<=bottom)&&(left<=right)){
			for(int i=left;i<=right;i++) {
				System.out.print(array[top][i]+" ");
			       printInArray(array[top][i]);
			}
			
			for(int i=top+1;i<=bottom;i++) {
				System.out.print(array[i][right]+" ");
			      printInArray(array[i][right]);
			}
			
			for(int i=right-1;(i>=left)&&(top!=bottom);i--) {
				System.out.print(array[bottom][i]+" ");
			      printInArray(array[bottom][i]);
			}
			
			for(int i=bottom-1;(i>=top+1)&&(left!=right);i--) {
				System.out.print(array[i][left]+" ");
			    printInArray(array[i][left]);
			}
			
			System.out.println();
			top++;
			bottom--;
			left++;
			right--;
		}
	}
	static void acceptInput() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int m=s.nextInt();
		System.out.print("Enter the no of coloumns : ");
		int n=s.nextInt();
		array=new int[m][n];
		output=new int[m][n];
		System.out.println("\nEnter the elements");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				array[i][j]=s.nextInt();
		
	}
	public static void main(String[] args) {
		acceptInput();
		printSpirally(array);
		System.out.println();
		display(output);
		
	}
}