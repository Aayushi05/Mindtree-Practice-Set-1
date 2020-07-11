package mindtree;

import java.util.Scanner;

public class Initial {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int len=name.length();
		char[] ch=new char[len];
		for(int i=0;i<len;i++)
			ch[i]=name.charAt(i);
		for(int i=0;i<len;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
			System.out.print(ch[i]);
				}
			}
		sc.close();
		}

}
