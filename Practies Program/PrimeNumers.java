//import java.util.Scanner;
public class PrimeNumers {
	public static void main(String[] args) {
		
		int k=0;
		//Scanner sc=new Scanner(System.in);
		System.out.println("The Prime is 1 to 100:");
		for(int i=1;i<100;i++)
		{
			k=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=1;
					break;
				}
			}
			if(k==0)
			{
			
				System.out.println(+i);
			}
		}
	}

}
