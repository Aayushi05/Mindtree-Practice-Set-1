package mindtree;
import java.util.Scanner;
public class primerange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,ct;
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(b>a) {
			for(i=a;i<=b;i++) {
				if (i == 1 || i == 0) 
	                continue;
				ct=1;
				for(j=2;j<=i/2;++j){
					if(i%j==0) {
						ct=0;
						break;
					}
				}
				if(ct==1)
				System.out.println(i);
				
			sc.close();}
		}
	}

}
