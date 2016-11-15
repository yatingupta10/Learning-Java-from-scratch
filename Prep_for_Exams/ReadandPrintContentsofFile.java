import java.io.*;

class ReadandPrintContentsofFile{
	public static void main(String args[]){
		String line = null;
		try{
			FileReader f = new FileReader("A.txt");
			BufferedReader b = new BufferedReader(f);
			while((line = b.readLine())!=null){
				System.out.println(line);
			}
			b.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}