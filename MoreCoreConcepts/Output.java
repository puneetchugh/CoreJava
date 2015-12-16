
import java.io.*;

public class Output{

	private OutputStream outStream;

	public Output() throws IOException{
		
		try{
			this.outStream = new BufferedOutputStream(new FileOutputStream("filecreatedByProgram.txt"));
		}catch(IOException ioe){
			ioe.printStackTrace();
			throw ioe;
		}
	}

	public void writeData(){
		
		int availableBytes = 0;
	
		String string = "My name is Puneet Chugh";

		byte[] bytes = new byte[string.length()];
		try{
			//availableBytes = outStream.available();
			
			
			for(int loopCounter = 0; loopCounter < string.length(); loopCounter++){
				bytes[loopCounter] = (byte) string.charAt(loopCounter);
				
			}
			
			outStream.write(bytes, 4, 10);
			outStream.flush();
			outStream.close();
		}catch(IOException ioe){
			
			ioe.printStackTrace();
		}	

		System.out.println("The total number of bytes are "+ availableBytes);
		
	}

	public static void main(String[] args) throws IOException{


		Output output = new Output();
		output.writeData();

		
	}
}
