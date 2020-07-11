package mindtree;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RevonlyStr {
	public static String Reverse(String value) {
		int len=value.length();
		char myChar = value.charAt(0);
		if (Character.isDigit(myChar)) {
		   return value;
		}
		String rev= "";
		for (int i = len - 1 ; i >= 0 ; i--)
		rev = rev + value.charAt(i);
		return rev;
	}
    public static void main(String a[]){
    String s;
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    String delims = " ";

    StringTokenizer st = new StringTokenizer(s, delims);
    		int len=st.countTokens();
            String[] array= new String[st.countTokens()];
            int i=0;
             while (st.hasMoreTokens())
             {
                array[i++]=st.nextToken();
             }
             for(int j=0;j<len;j++) {
            	 array[j]=RevonlyStr.Reverse(array[j]);
            	 
             }
             for(int j=0;j<len;j++) {
            	 System.out.print(array[j]+" ");
            	 
             }
             sc.close();
     }

}
