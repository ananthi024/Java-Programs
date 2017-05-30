import java.util.Scanner;
public class BiggestNum {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 1st Number:");
		a=sc.nextInt();
		System.out.println("Enter The 2nd Number:");
		b=sc.nextInt();
		System.out.println("Enter The 3rd Number:");
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is Biggest");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is Biggest");
		}
		else if(c>a&&c>b)
		{
			System.out.println("c is Biggest");
		}
		else
		{
			System.out.println("Exit...........");
		}
	}

}
