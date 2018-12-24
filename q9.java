import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int a,b,c,flag=1;
int pro=0;
a=1;  b=2;  c=3;
while(c<997 && flag==1)
{b=2;
while(b<c && flag==1)
{a=1;
	while(a<b && flag==1)
	{
		if((a*a)+(b*b)==(c*c))
		{
			if(a+b+c==1000)
			{
				pro=(a*b)*c;
				System.out.println("product of the pythagorean triplet="+pro);
			}
		}
		a++;
	}
	b++;
}
c++;
}
	}

}
