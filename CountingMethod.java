class CountingMethod{  
	static int count=0;//will get memory only once and retain its value  
  
	CountingMethod(){  
		count++;  
		System.out.println(count);  
	}  
  
	public static void main(String args[]){  
  
		CountingMethod c1=new CountingMethod();  
		CountingMethod c2=new CountingMethod();  
		CountingMethod c3=new CountingMethod();  
  
 }  
}  