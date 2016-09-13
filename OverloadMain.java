class OverloadMain{  
	public static void main(int a){  
		System.out.println(a);  
  	}  
    
  	public static void main(String args[]){  
  		System.out.println("main() method invoked");  
  		main(10);  
  	}  
}  