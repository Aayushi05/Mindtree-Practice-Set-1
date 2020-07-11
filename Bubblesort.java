package mindtree;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) 
	{
		int l;
		Scanner sc= new Scanner(System.in);
	    l=sc.nextInt();		
		int i,j;
		int a[]=new int[l];
		for(i=0;i<l;i++)
			a[i]=sc.nextInt();
		int n=a.length;
		for(i=0;i<n-1;i++) 
		{
			for(j=0;j<n-1-i;j++) 
			{
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
		for(i=0;i<n;i++) 
			System.out.print(a[i]+" ");
		sc.close();
	}
}
