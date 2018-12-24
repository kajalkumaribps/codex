
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n=1000;
int sum=0;
for(int i=1;i<1000;i++)
{
	if((i%3==0)||(i%5==0))
	{
		sum=sum+i;
	}
		
}
System.out.println("sum of all the multiple of 3 or 5 below "+1000+"="+sum);
	}

}
