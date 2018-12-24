import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
long sum=2;

for(long i=3;i<=2000000;i=i+2)
{
	     int c=0;
		for(int j=2;j<=Math.sqrt(i);j++)
		{
			if(i%j==0)
			{
				c=1;
				break;
			}
		}
		if(c==0)
		{
			sum=sum+i;
		}
}
System.out.println("Sum of all the primes below two million="+sum);
	}

}
