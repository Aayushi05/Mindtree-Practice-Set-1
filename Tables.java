package mindtree;
import java.util.Scanner;
public class Tables {
	public static void main(String[] args) {
		System.out.print("Enter the no  :");
		Scanner obj=new Scanner(System.in);
		int a;
		a=obj.nextInt();
		for(int i=1;i<=12;i++)
			System.out.println(a+"*"+i+"="+a*i);
		obj.close();
	}


}
