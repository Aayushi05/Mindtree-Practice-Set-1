package mindtree;
import java.util.Scanner;

public class maxar {
	public static void main(String[] args) {
		int max=0;
		Scanner n=new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<3;i++)
		{
			a[i]=n.nextInt();
		}
		for(int i=0;i<3;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		n.close();
	}

}
