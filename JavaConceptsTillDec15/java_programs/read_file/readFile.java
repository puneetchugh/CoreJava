
import java.io.*;

public class readFile
{
	public static void main(String arg[]) throws Exception
	{
		FileInputStream in = null;
		FileOutputStream out1 = null;
		FileOutputStream out2 = null;
		
		out1 = new FileOutputStream("output1.txt");	
		out2 = new FileOutputStream("output2.txt");
		in = new FileInputStream("reading.txt");
		FileDescriptor fd =  in.getFD();	
	/*	if(fd < 0)
		{
			//System.out.println("File is available and non-empty");
			System.out.println("We could not find file_descriptor for reading.txt file");
		}
	*/	
		System.out.println("The value of file descriptor is "+(fd));
		while(in.available() > 0)
		{

			int c = in.read();
			if((c >= 48) && (c <= 57))
			{
				System.out.println("It is a number = " + (c - 48));				
				
				out1.write(c);
			}
		
			else
			{
				System.out.println("It is a character = " + (char)c);
				out2.write(c);
			}
		
		}
	}
}
