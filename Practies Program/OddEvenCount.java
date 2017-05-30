import java.util.Scanner;
public class OddEvenCount {
public static void main(String[] args) {
	int Even=0,Odd=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Elements:");
	int a[]=new int[10];
	for(int i=1;i<10;i++)
	{
		System.out.println("Enter the Elements:");
		a[i]=sc.nextInt();
	}
	for(int i=1;i<10;i++)
	{
		if(a[i]%2==0)
		{
			Even=Even+a[i];
		}
		else
		{
			Odd=Odd+a[i];
		}
	}
	System.out.println("Sum of The Even Numbers:"+Even);
	System.out.println("Sum of The Odd Numbers:"+Odd);
}
}
