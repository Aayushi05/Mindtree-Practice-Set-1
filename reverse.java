package mindtree;

import java.util.Scanner;

public class reverse {
	public static void main(String args[])
    {
        int m, num, rev = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = n.nextInt();
        while(m > 0)
        {
            num = m % 10;
            rev = (rev*10)+ num;
            m = m / 10;
        }
        System.out.println("Reverse order of no is "+rev);
        n.close();
    }

}
