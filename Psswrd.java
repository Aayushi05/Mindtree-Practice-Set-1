package mindtree;

import java.util.Scanner;

public class Psswrd {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name Without spaces eg.AayushiSingh:   ");
		String name=sc.next();
		System.out.print("Enter age:   ");
		int age=sc.nextInt();
		int len=name.length();
		char[] ch=new char[len];
		char[] chcount=new char[len];
		int j=0;
		for(int i=0;i<len;i++)
			ch[i]=name.charAt(i);
		for(int i=0;i<len;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				chcount[j++]=ch[i];
				}
			}
		System.out.print("Your Password is   ");
		for(int i=0;i<j;i++)
		System.out.print(chcount[i]);
		System.out.print(age+"!");
		sc.close();
	}

}
