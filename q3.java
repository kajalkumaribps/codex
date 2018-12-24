import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter the number");
 long n=sc.nextLong();
 long m=n;
 long mxpr=0;
 if(n%2==0)
 { mxpr=2;}
 for(long i=3;i<=n;i=i+2)
{
if(n%i==0)
	{
	long c=0;
	for(long j=2;j<=Math.sqrt(i);j++)
	{
		if(i%j==0)
		{
		c=1;
		break;
		}
	}
	if(c==0)
	{
		n/=i;
		if(mxpr<i)
			mxpr=i;
	}
	}
}
System.out.println("largest prime factor of the number "+m+ "="+mxpr);
 }

}
