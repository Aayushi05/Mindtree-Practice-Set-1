package mindtree;

import java.util.Scanner;

public class ConsolePrin {
	public static void print(String a) {
		System.out.println("Hello, "+a+"!");
	}
	public static void main(String[] args){
	System.out.print("Enter the String  :");
	Scanner obj=new Scanner(System.in);
	String a=obj.nextLine();
	ConsolePrin.print(a);
	obj.close();
	}
}
