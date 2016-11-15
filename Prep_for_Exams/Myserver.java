import java.io.*;
import java.net.*;

class Myserver{
	public static void main(String args[]){
		try{
			ServerSocket s = new ServerSocket(8080);
			Socket sk = s.accept();
			BufferedReader b = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			String st;
			while((st=b.readLine())!=null){
				System.out.println(st);
			} 
			sk.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}