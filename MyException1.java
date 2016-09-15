public class MyException1{
	public static void main(String []args){
		try{
			int a = 8/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Code resumed..");
	}
}