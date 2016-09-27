class TestMemberInner{  
	
	private int data=30;  
	
	class Inner{  
		
		void msg(){System.out.println("data is "+data);}  
 	}  
 	
 	public static void main(String args[]){  
  		TestMemberInner obj=new TestMemberInner();  
  		TestMemberInner.Inner in=obj.new Inner();  
  		in.msg();  
 	}  
}  