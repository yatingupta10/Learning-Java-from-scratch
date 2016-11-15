import java.io.*;

class CountCharsinFile{
	public static void main(String args[]){
		int i, count = 0;
		try{
			FileReader f = new FileReader("A.txt");
			while((i=f.read())!=-1){
				count++;
			}
			f.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(count);
	}
}