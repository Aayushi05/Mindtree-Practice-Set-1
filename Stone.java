package mindtree;
import java.util.Scanner;
public class Stone {
	public static void main(String[] args) {
		System.out.print("Enter the no  :");
		Scanner sc=new Scanner(System.in);
		int n,z=0;
		n=sc.nextInt();
		while(n!=1&&n>0)
		{
			if(n%2==0) 
			{
				System.out.println(n+"   is even so i take half : "+n/2);
				n=n/2;
			}
			else
			{
				System.out.println(n+"  is odd so i make 3n+1 : "+(3*n+1));
				n=3*n+1;
			}
			z++;
		}
		System.out.print("There are total "+z+" steps to reach 1");
		sc.close();
	}

}
