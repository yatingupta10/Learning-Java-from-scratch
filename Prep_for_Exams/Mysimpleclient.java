import java.io.*;
import java.net.*;

class Mysimpleclient{
	public static void main(String args[]) throws IOException{
		Socket si = new Socket("localhost", 1254);
		InputStream s1in = si.getInputStream();
		DataInputStream dis = new DataInputStream(s1in);
		String st = new String(dis.readUTF());
		System.out.println(st);
		dis.close();
		s1in.close();
		si.close();
	}
}