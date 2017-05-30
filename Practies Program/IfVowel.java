import java.util.Scanner;
public class IfVowel {
			public static void main(String[] args) {
			char ch;
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter Your Character:");
			ch=sc.next().charAt(0);
			
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					System.out.println("The Given Character is Vowel");
				}
				else	
				{
				System.out.println("The Given Character is Consonant");
				}
			}
			
		}


	

