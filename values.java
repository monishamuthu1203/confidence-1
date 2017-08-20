package Threads;

import java.util.Scanner;

public class values extends Thread
{
	static int x,y;
	Scanner s=new Scanner(System.in);
public void run()
{
	System.out.println("Enter the value of x & y:");
	x=s.nextInt();
	y=s.nextInt();
	
}
	
}	



