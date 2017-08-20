import java.util.Scanner;
public class BubbleSort {
	int n,i,j,temp;
	int a[]=new int[10];
	Scanner s=new Scanner(System.in);
	void getdata()
	{
		System.out.println("enter the no of values");
		n=s.nextInt();
		System.out.println("enter the values");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	}
	void bubble()
	{
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("sorted array:");
		for(i=0;i<n;i++)
		{
			System.out.println("\t" +a[i]);
			
		}
	}
public static void main(String[] args)
{
	BubbleSort b=new BubbleSort();
	b.getdata();
	b.bubble();
}
}
