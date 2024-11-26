import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) throws IOException {
		
		File f=new File("abc.txt");
		writeToFile(f);
		readFile(f);
		
	}

	public static void readFile(File f) throws FileNotFoundException, IOException {
		
		FileInputStream fin=new FileInputStream(f);
		
		int i=fin.read();
		while(i!=-1)
		{
		  System.out.print((char)i);
		  i=fin.read();
		}
		fin.close();
	}
	
	
	
	static void writeToFile(File f) throws IOException
	{
       FileOutputStream fout=new FileOutputStream(f);
		
		byte[] barr= {97,98,99,100,101,102};
		fout.write(barr);
		
		//fout.wr
		System.out.println("Written successfully");
		fout.close();
	}
	
	
	

}