
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for(int i=20;;i=i+20)
{
	int c=0;
	for(int j=1;j<=20;j++)
	{
		if(i%j!=0)
		{
			c=1;
			break;
		}
	}
	if(c==0)
	{
		System.out.println("The smallest positive number that is evenly divisible by all of the number from 1 to 20 ="+i);
		break;
	}
}
	}

}
