package mindtree;
import java.util.Scanner;
public class SumArrEl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,sum=0;
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Elements of array");
		for(int i=0;i<size;i++) 
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of the array is "+sum);
		sc.close();
	}

}
