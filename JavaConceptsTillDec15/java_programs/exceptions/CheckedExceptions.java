import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions{

	public static void main(String[] args){
	
	try{	
			BufferedReader bufferedReader = null;
			fileOpen(bufferedReader);
		}
		
		catch(IOException ioe){
			System.out.println("main function: File does not exits");
			
		}
	}

	public static void fileOpen(BufferedReader bufferedReader) throws IOException {
		
		try{
			fileOpening(bufferedReader, "puneet.txt");
		}

		
		
		catch(IOException ioe){

			System.out.println("File does not exist");
			throw new IOException(ioe);
		}

	}

	public static void fileOpening(BufferedReader bufferedReader, String fileName) throws IOException{
		
		bufferedReader = new BufferedReader(new FileReader(fileName));
		if(bufferedReader == null){
			throw new IOException("File does not exist");
		}

	}
	
}
