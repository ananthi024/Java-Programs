//import java.util.Scanner;
public class PerfectNumbers {
	public static void main(String[] args) {
		int num=0;
		int limit;
		//Scanner sc=new Scanner(System.in);
		System.out.println("Perfect Number 1 to 100");
		for(int i=1;i<=100;i++)
		{
			num=0;
			for(int j=1;j<i;j++)
			{
				if((i%j)==0)
					num=num+j;
			}
			if(i==num)
			{
				System.out.println(+i);
			}
			
		}
	}

}
