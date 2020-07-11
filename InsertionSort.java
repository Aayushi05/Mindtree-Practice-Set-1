package mindtree;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
	  public void InsertionSort(int[] nums){
	  for(int i = 1; i < nums.length; i++){
	    int value = nums[i];
	    int j = i - 1;
	    while(j >= 0 && nums[j] > value){
	      nums[j + 1] = nums[j];
	      j = j - 1;
	    }
	    nums[j + 1] = value;
	  }
	}
	    public static void main(String args[])
	    {
	    	int size;
	        InsertionSort ob = new InsertionSort();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of array");
			size=sc.nextInt();
			int a[] = new int[size];
			System.out.println("Enter the Elements of array");
			for(int i=0;i<size;i++) 
			{
				a[i]=sc.nextInt();
			}
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(a));
	        ob.InsertionSort(a);
	        System.out.println("Sorted Array");
	        System.out.println(Arrays.toString(a));
	        sc.close();
	    }
	}