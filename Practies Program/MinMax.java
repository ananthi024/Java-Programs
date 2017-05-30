import java.util.Scanner;
public class MinMax {
public static void main(String[] args) {
	int max;
	int min;
	int val;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Value:");
	val=sc.nextInt();
	min=max=val;
	while(val!=0)
	//for(int i=1;1<10;i++)
	{
		System.out.println("Enter The Value");
		val=sc.nextInt();
		if(val<min)
		{
			min=val;
		}
		if(val>max)
		{
			max=val;
		}
		System.out.println("Minimum:"+min);
		System.out.println("Maximum:"+max);
	}
	
}
}
