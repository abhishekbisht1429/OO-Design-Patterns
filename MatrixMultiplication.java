import java.util.*;
class MatrixMultiplication {
	static int input1[][]={{1,2,3},
		                   {4,5,6},
	                       {7,8,9}};
	static int input2[][]={{1,2,3},
		                   {4,5,6},
	                       {7,8,9}};
	static int output[][]=new int[3][3];
	static void acceptInput(int[][] array) {
		System.out.println("Enter elements of matrix");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				array[i][j]=s.nextInt();
	}
	static void display(int[][] array) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
		}
	}
	
	static void multiply() {
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++) 
				for(int k=0;k<3;k++)
					output[i][j]+=input1[i][k]*input2[k][j];
	}
	public static void main(String[] args) {
		multiply();
		display(output);
	}
}