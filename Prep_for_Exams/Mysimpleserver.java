import java.net.*;
import java.io.*;

class Mysimpleserver{
	public static void main(String args[]) throws IOException{
		ServerSocket s = new ServerSocket(1254);
		Socket s1 = s.accept();
		OutputStream s1out = s1.getOutputStream();
		DataOutputStream dos = new DataOutputStream(s1out);
		dos.writeUTF("hi");
		dos.close();
		s1out.close();
		s1.close();
	}
}