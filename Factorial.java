package factorial;
import java.util.Scanner;


public class Factorial {
	int i,n;
	 boolean n1;
     Scanner s=new Scanner(System.in);

void fact()
{
	do
	{
		System.out.println("enter the no");
		
		n=s.nextInt();
	int 	fact=1;
	
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
System.out.println("factorail  of no :"+fact);
		System.out.println("Do u want to continue");
        n1=s.nextBoolean();
	
        
	}while(n1==true);
	
}
	public static void main(String[] args) {
        
       Factorial f=new Factorial();
		f.fact();
		
		}
}
	

	


