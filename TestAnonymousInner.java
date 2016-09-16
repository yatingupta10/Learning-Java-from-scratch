abstract class Person{  

	abstract void sayhi();  

}  

class TestAnonymousInner{  
	public static void main(String args[]){  
		Person p=new Person(){  
			void sayhi(){System.out.println("hi!");}  
		};  
		p.sayhi();  
	}  
}  