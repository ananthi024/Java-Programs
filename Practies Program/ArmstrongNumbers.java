
public class ArmstrongNumbers {
	public static void main(String[] args) {
		int temp=0;
		int i;
		//int d;
		int n;
		int limit=500;
		//Scanner sc=new Scanner(System.in);
		System.out.println("Armstrong Number 100 to 500");
		//n=sc.nextInt();
		//d=n;
		for(int j=100;j<=limit;j++)
		{
			n=j;
			while(n>0)
			{
				i=n%10;
				temp=temp+(i*i*i);
				n=n/10;
			
			}
			if(temp==j)
			{
			System.out.println(+j);
			}
		temp=0;
		}
	}

}
