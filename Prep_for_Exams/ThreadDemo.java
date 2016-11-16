class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t = new Thread(this, "Demo thread");
		System.out.println("Child Thread: "+t);
		t.start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
				e.printStackTrace();
		}
		System.out.println("Exiting child thread");
	}
}

class ThreadDemo{
	public static void main(String args[]){
		new NewThread();
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
					e.printStackTrace();
		}
		System.out.println("Exiting main thread");
	}
}