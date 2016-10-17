public class ThreadRunnable implements Runnable
{
	Thread t;
	ThreadRunnable(String s)
	{
		t=new Thread(this,s);
	}
	public void run()
	{
		String n=this.t.getName();
		for(int i=0;i<5;i++)
		{
			if(n.equals("A"))
			{
				System.out.print("A ");
				try
				{
					t.sleep(1000);
				}
				catch(Exception e)
				{e.printStackTrace();}
			}
			else
			{
				System.out.print("B ");
				try
				{
					t.sleep(500);
				}
				catch(Exception e)
				{e.printStackTrace();}
			}
		}
	}
	public static void main(String ar[])
	{
		ThreadRunnable m1=new ThreadRunnable("A");
		ThreadRunnable m2=new ThreadRunnable("B");
		m1.t.start();
		m2.t.start();
	}
}