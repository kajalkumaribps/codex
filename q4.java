import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int i,j,r,n;
int d;
int max=0;
for(i=100;i<=999;i++)
{
	for(j=100;j<=999;j++)
	{
		d=0;
		n=0;
		 n=i*j;
		int m=n;
		while(n>0)
		{
			r=n%10;
			d=(d*10)+r;
			n=n/10;
		}
		if(m==d)
		{
			if(m>max)
				max=m;
		}
	}
}
			System.out.println("largest palindrome made from the product of two 3-digit numbers="+max);
	}

}
