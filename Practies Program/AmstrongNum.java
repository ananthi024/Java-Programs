import java.util.Scanner;
public class AmstrongNum {
	public static void main(String[] args) {
		int temp=0;
		int i;
		int d;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		n=sc.nextInt();
		d=n;
		while(n>0)
		{
			i=n%10;
			n=n/10;
			temp=temp+(i*i*i);
		}
		if(temp==d)
		{
			System.out.println("This is Amstrong Number");
		}
		else
		{
			System.out.println("This is Not Amstrong Number");
		}
	}

}
