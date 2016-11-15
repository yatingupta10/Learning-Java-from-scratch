import java.net.*;
import java.io.*;

class Myclient{
	public static void main(String args[]){
		try{
			PrintWriter p;
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			Socket s = new Socket(InetAddress.getLocalHost(), 8080);
			p = new PrintWriter(s.getOutputStream(), true);
			String bt;
			while((bt=b.readLine())!=null){
				p.println(bt);
			}
			s.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}