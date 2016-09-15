class InvalidAgeException extends Exception{  
	InvalidAgeException(String s){  
		super(s);  
	}  
}  

class CustomException{
	static void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("you are eligible to vote");
	}

	public static void main(String []args){
		try{
			validate(5);
		}catch(Exception e){
			System.out.println("Exception is: "+e);
		}
		System.out.println("code...");
	}
}