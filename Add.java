package threads; 
public class Add extends values 
{
	public void run()
	{
	int add=x+y;
	System.out.println("The addition is="+add);
	}
	
public static void main(String[] args) throws InterruptedException
{
  values v1=new values();
  Add a1=new Add();
  v1.start();
  v1.join();
  a1.start();
}

}
 
