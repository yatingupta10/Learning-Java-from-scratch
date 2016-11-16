class NewThread implements Runnable{
	Thread t;
	String name;

	NewThread(String threadname){
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: "+t);
		t.start();
	}

	public void run(){
		try{
			for(int i=5; i>0; i--){
				System.out.println(name+": "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(name + " exiting.");
	}
}

class DemoJoin{
	public static void main(String args[]){
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		System.out.println("threadone is alive: "+ob1.t.isAlive());
		System.out.println("threadtwo is alive: "+ob2.t.isAlive());
		System.out.println("threadthree is alive: "+ob3.t.isAlive());
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("threadone is alive: "+ob1.t.isAlive());
		System.out.println("threadtwo is alive: "+ob2.t.isAlive());
		System.out.println("threadthree is alive: "+ob3.t.isAlive());
		System.out.println("mainthread is exiting");
	}
}