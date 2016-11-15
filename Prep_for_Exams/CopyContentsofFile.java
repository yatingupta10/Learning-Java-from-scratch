import java.io.*;

class CopyContentsofFile{
	public static void main(String args[]){
		int i;
		try{
			FileReader f = new FileReader("A.txt");
			FileWriter f1 = new FileWriter("B.txt");
			while((i = f.read())!=-1){
				f1.write((char)i);
			}
			f.close();
			f1.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}