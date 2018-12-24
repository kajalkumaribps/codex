
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int c=1;
int i=3;
int prime;
while(c<=10001)
{
	int ctr=0;
	for(int k=2;k<i;k++)
	{
		if(i%k==0)
		{
			ctr++;
			break;
		}
	}
		if(ctr==0)
		{
			prime=i;
			c++;
			if(c==10001)
			{
				System.out.println("prime number at 10001st position is ="+prime);
			}
		}
	i=i+2;
}
	}

}
