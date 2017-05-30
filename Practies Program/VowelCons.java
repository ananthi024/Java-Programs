import java.util.Scanner;
public class VowelCons {
	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Character:");
		ch=sc.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("a is Vowel");
			break;
		case 'e':
			System.out.println("e is Vowel");
			break;
		case 'i':
			System.out.println("i is Vowel");
			break;
		case 'o':
			System.out.println("0 is Vowel");
			break;
		case 'u':
			System.out.println("u is Vowel");
			break;
		default:
			System.out.println("The Given Character is Consonant");
			break;
		}
		
	}

}
