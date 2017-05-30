import java.util.Scanner;
public class SumOfDigit {
public static void main(String[] args) {
	int sum=0;
	int no;
	int temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number:");
	no=sc.nextInt();
	while(no>0)
	{
		temp=no%10;
		no=no/10;
		sum=sum+temp;
	}
	System.out.println("Sum Of The Digits:"+sum);
}
}
