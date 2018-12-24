public class q6 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner (System.in);
int i, s=0,sum=0;
int sq=0;
int diff;
for(i=1;i<=100;i++)
{
s=s+(i*i);
sum=sum+i;
}
sq=sum*sum;
diff=sq-s;
System.out.println("The difference between the of the square of the first 100 natural numbers and the square of the sum ="+diff);
	}
}


