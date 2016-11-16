class Table{
	synchronized void printable(int n){
		for(int i=1; i<=5; i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class MyT1 extends Thread{
	Table t;
	MyT1(Table t){
		this.t = t;
	}
	public void run(){
		t.printable(5);
	}
}

class MyT2 extends Thread{
	Table t;
	MyT2(Table t){
		this.t = t;
	}
	public void run(){
		t.printable(100);
	}
}

public class ThreadSync{
	public static void main(String args[]){
		Table obj = new Table();
		MyT1 t1 = new MyT1(obj);
		MyT2 t2 = new MyT2(obj);
		t1.start();
		t2.start();
	}
}