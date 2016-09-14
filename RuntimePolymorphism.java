class Animal{  
	
	void run(){
		System.out.println("in animal class");
	}  
}  

class RuntimePolymorphism extends Animal{  
	void run(){
		System.out.println("in RuntimePolymorphism class");
	}  
  
	public static void main(String args[]){  
		Animal b = new RuntimePolymorphism();//upcasting  
		b.run();  
	}  
}  