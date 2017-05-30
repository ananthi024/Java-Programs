import java.util.Scanner;
public class OddEven {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number:");
n=sc.nextInt();
if(n%2==0)
{
	System.out.println("The Given Number is Even");
}
else
{
	System.out.println("The Given Number is Odd");
}
}
}
