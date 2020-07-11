package mindtree;

import java.util.Scanner;

public class BinSearch {

	public static boolean findElement(int arr[], int search) {
		int size=arr.length;	
		int low,high,mid;
		low=0;
		high=size-1;
		while(low<=high) {
			mid=(low+high)/2;
		if(arr[mid]==search)
			return true;
		else if(arr[mid]>search) {
			high=mid-1;
			
		}
		else
			low=mid+1;
		}
		return false;
		}
		public static boolean findString(String[] arr1, String search1) {
			int size=arr1.length;
			int low,high,mid;
			low=0;
			high=size-1;
			while(low<=high) {
			mid=(low+high)/2;
			 int res = search1.compareTo(arr1[mid]);
			 if (res == 0) 
	             return true;  
			 else if (res > 0) 
	             low = mid + 1;  
	         else
	             high = mid - 1; 
			}
			return false;
		}
		public static void main(String[] args) {
			int option;
			System.out.println("Enter the option");
			System.out.println("1. Binary search for Integer elements");
			System.out.println("2. Binary search for Strings");
			System.out.println("3. Exit");
			Scanner sc= new Scanner(System.in);
			option=sc.nextInt();
			while(true) {
				switch(option){
					case 1:
						System.out.println("Enter the size of array for integer array");
						int size=sc.nextInt();
						int a[]= new int[size];
						System.out.println("Enter the array elements");
						for(int i=0;i<size;i++) {
							a[i]=sc.nextInt();
						}
						System.out.println("Enter the search element");
						int search=sc.nextInt();
						boolean result=BinSearch.findElement(a, search);
						System.out.println(result);		
						System.exit(0);
					case 2:
					System.out.println("Enter the size of array for string array");
					int stringsize=sc.nextInt();
					String[] a1= new String[stringsize];
					System.out.println("Enter the array elements");
					for(int i=0;i<stringsize;i++) {
						a1[i]=sc.next();
					}
					System.out.println("Enter the search element");
					String search1=sc.next();
					boolean result1=BinSearch.findString(a1, search1);
					System.out.println(result1);		
					System.exit(0);
					case 3:System.out.println("Thank You");
							System.exit(0);
					default:System.out.println("Wrong Choice Enter Again");
							option=sc.nextInt();
							
				}
			}
		}
}
