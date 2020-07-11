package mindtree;
import java.util.Scanner;

public class prime {
	public static boolean IsPrime(int n) {
		if(n==0||n==1)
			return false;
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(IsPrime(n));	
		
	}
}
