import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args) {
		int n=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		num=sc.nextInt();
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				n=n+i;
			}
		}
		if(n==num)
		{
			System.out.println("The Number is Perfect");
		}
		else
		{
			System.out.println("The Number is Not Perfect");
		}
	}

}
