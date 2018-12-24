
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=1;
int b=1;
int c=0;
int sum=0;
while(c<4*(int)Math.pow(10, 6))
{
	c=a+b;
	if(c%2==0)
	{
		sum=sum+c;
	}
	a=b;
	b=c;
}
System.out.println("sum of the even valued terms of fibonacci sequence belob 4 millon ="+sum);

	}
}
