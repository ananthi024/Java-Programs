import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int Year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Year:");
		Year=sc.nextInt();
		if((Year%400==0)||((Year%4==0)&&(Year%100!=0)))
		{
			System.out.println("This Year is Leap Year");
		}
		else
		{
			System.out.println("This Year is Not Leap Year");
		}
	}

}
