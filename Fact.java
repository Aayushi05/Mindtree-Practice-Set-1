package mindtree;
import java.util.Scanner;


public class Fact {
	public static void main(String[] args) {
		System.out.print("Enter the no  :");
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		int fact=1;
		for(int i=1;i<=f;i++)
			fact=fact*i;
		System.out.println("The factorial off the no is " +fact);
		sc.close();
	}
}
