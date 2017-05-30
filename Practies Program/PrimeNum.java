import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		int num;
		int i;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%2==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("The Number is Prime");
		}
		else
		{
			System.out.println("The Number is Not Prime");
		}
	}
	

}
