

public class MyThread extends Thread{
	public void run(){
		int i;
		for(i=0;i<5;i++)
		System.out.println("A");
	}
	public static void main(String args[]){
		MyThread mt=new MyThread();
		System.out.println("C");
		mt.start();
		System.out.println("B");
	}
}