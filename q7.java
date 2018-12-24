
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 long c1=0,i=2,prime=0;
		 int ctr=0;
		 while(i>0)
		 {
			 for(long k=1;k<=Math.sqrt(i);k++)
			 {
				 if(i%k==0)
				  ctr++;
		          }
			 if(ctr==1)
			   c1++;
			  if(c1==10001)
			 {
				 prime=i;
				 break;
			 }
			 i++;
			 ctr=0;
		 }
		 System.out.println("10001st prime is:"+prime);
           }

      }
