import java.util.Scanner;
public class EvenNumbers {
	public static void main(String[] args) {
		int limit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		limit=sc.nextInt();
		for(int i=1;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
			}
		}
	}

}
