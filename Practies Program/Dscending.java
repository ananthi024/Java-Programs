import java.util.Scanner;
public class Dscending {
public static void main(String[] args) {
	int n,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int a[]=new int[10];
	for(int i=0;i<10;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		for(int j=i+1;j<10;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Descending Order");
	for(int i=0;i<10-1;i++)
	{
		System.out.println(a[i]+"");
	}
	System.out.println(a[10-1]);
}
}
