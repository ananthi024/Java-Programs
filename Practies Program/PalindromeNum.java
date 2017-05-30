import java.util.Scanner;
public class PalindromeNum {
public static void main(String[] args) {
	int sum=0;
	int temp;
	int n;
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	n=sc.nextInt();
	
	temp=n;
	while(n>0)
	{
		a=n%10;
		sum=(sum*10)+a;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("The Number is Palindrome");
	}
	else
	{
		System.out.println("The Number is Not Palindrome");
	}
}
}
