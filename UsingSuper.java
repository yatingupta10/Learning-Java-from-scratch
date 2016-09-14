class Person{  
	void message(){
		System.out.println("welcome");
	}  
}  
  
class UsingSuper extends Person{  
	
	void message(){
		System.out.println("welcome to java");
	}  
  
	void display(){  
		message();//will invoke current class message() method  
		super.message();//will invoke parent class message() method  
	}  
  
	public static void main(String args[]){  
		UsingSuper s=new UsingSuper();  
		s.display();  
	}  
}  