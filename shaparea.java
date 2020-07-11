package mindtree;

import java.util.Scanner;

public class shaparea {
	public static void main (String[] args) {
		int l,b,r,a;
		float area=(float) 0.00;
		Scanner sc = new Scanner(System.in);
		String shape = sc.nextLine();
		switch(shape){
			case "Triangle": 
				l=sc.nextInt();
				b=sc.nextInt();
				area=(float)(l*b)/2;
				break;
			case "Rectangle":
				l=sc.nextInt();
			    b=sc.nextInt();
				area=(float)l*b;
				break;
			case "Square":
				a=sc.nextInt();
				area=(float)a*a;
				break;
			case "Circle":
				r=sc.nextInt();
				area=(float) (3.14*r*r);
				break;
			default:
				System.out.println("Wrong Choice");
		}
		if((float)area>0)
		System.out.println(area);
		sc.close();
		}

}
