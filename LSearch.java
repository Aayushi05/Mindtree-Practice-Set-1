package mindtree;

import java.util.Scanner;

public class LSearch {
	private static boolean value;
	private static int size;
	public static boolean Search(int a[],int elem) {
		int i;
		for(i=0;i<size;i++)
		{
			if(a[i]==elem)
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) 
	{
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();		
		int i;
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the search elem");
		num=sc.nextInt();
		value = LSearch.Search(a, num);
		System.out.println(value);
		sc.close();
	}

}
