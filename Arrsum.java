package mindtree;

public class Arrsum {
	public static void main(String[] args) {
		double a1[]={10.0,20.0,30.0};
		double a2[]={20.0,50.0,30.0,70.0,80.0};
		int l1,l2;
		l1=a1.length;
		l2=a2.length;
		if(l1>l2) 
		{
			double c[]= new double[l1];
			for(int i=0;i<l1;i++)
			{
				c[i]=a1[i];
			}
			for(int i=0;i<l2;i++)
			{
				c[i]=c[i]+a2[i];
			}
			for(int i=0;i<l1;i++)
			{
				System.out.print((int)Math.round(c[i])+" ");
			}
		}
		else
		{
			double c[]= new double[l2];
			for(int i=0;i<l2;i++)
			{
				c[i]=a2[i];
			}
			for(int i=0;i<l1;i++)
			{
				c[i]=c[i]+a1[i];
			}
			for(int i=0;i<l2;i++)
			{
				System.out.print((int)Math.round(c[i])+" ");
			}
		}
		
		
	}
}
