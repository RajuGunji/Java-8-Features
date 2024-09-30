package Practice;

public class Practice
{
	public void m2()
	{
		for(int i=10;i>0;i--)
		{
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		Practice p=new Practice();
		Runnable r=p::m2;
		Thread t=new Thread(r);
		t.start();
		
	}

}
interface Inter
{
	public void m1();
}