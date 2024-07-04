import java.util.Scanner;
class factdowhile
{
	public static void main(String [] args)
	{
		int no,f=1,i=1;
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		do
		{
			f=f*i;
			i++;
		}
		while(i<=no);
		System.out.println("factorial:"+f);
	}
}

			
		