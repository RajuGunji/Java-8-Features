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
		Practice p1=new Practice();
		Runnable r=p1::m2;
		Thread t=new Thread(r);
		t.start()
		
	}

}
interface Inter
{
	public void m1();
}
