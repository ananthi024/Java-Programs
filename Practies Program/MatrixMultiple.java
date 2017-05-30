import java.util.Scanner;
public class MatrixMultiple {
public static void main(String[] args) {
	int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number of Rows:");
	int rows=sc.nextInt();
	System.out.println("Enter The Number of Cols:");
	int cols=sc.nextInt();
	int a[][]=new int[rows][cols];
	int b[][]=new int[rows][cols];
	int c[][]=new int[rows][cols];
	System.out.println("Enter The First Matrix:");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter The Second Matrix:");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			c[i][j]=a[i][j]*b[i][j];
		} 
	}
	System.out.println("Multiple of Two Matrix:");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
		
	
	
}
}

