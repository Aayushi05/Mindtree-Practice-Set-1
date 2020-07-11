package mindtree;

import java.util.Scanner;

public class ExLname {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String fName=a.substring(0,a.indexOf(" "));
        String lName=a.substring(a.indexOf(" "));
		String fName1=b.substring(0,b.indexOf(" "));
        String lName1=b.substring(b.indexOf(" "));
        String swapName=fName+" "+lName1;
        String swapName2=fName1+" "+lName;
        System.out.println("After Swap");
        System.out.println(swapName);
        System.out.println(swapName2);

        sc.close();
	}

}
