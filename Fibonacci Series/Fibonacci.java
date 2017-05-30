import java.util.Scanner;
class Fibonacci
{
public static void main(String[] args)
{
int i=0,j=1,k=2,r,f;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number Range:");
r=sc.nextInt();
System.out.println("Fibonacci Series:");
System.out.println(""+i);
System.out.println(""+j);
while(k<r)
{
f=i+j;
i=j;
j=f;
System.out.println(""+j);
k++;
}
}
}


