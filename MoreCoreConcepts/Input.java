// If a variable is declared inside the try block, then its not visible outise the try block. Why ?

//Even constructors can throw Exception and have that in the signature "throws xyzException"

// %b is not the format specifir of a byte


import java.io.*;

public class Input{

	private InputStream inputStream;

	public Input()throws IOException{

		try{
			this.inputStream = new FileInputStream("file.txt");
		}catch(IOException ioe){
			throw new IOException();
			//ioe.printStackTrace();
		}
	}

	public int readText() throws IOException{
	
		int availableBytes;	
		try{
		
			availableBytes = inputStream.available();
		}catch(IOException ioe){
			throw ioe;
		}

		//byte singleByte;
		byte[] wholeData = new byte[availableBytes];
		inputStream.read(wholeData);
		//char singleByte = (byte)inputStream.read();
		//System.out.println("The byte read is "+singleByte);
		for(byte singleByte: wholeData){
			
			System.out.print((char)singleByte);
		}
		System.out.println("The number of bytes available in the file are "+availableBytes);
		return availableBytes;
	}

	public static void main(String[] args) throws IOException {

		try{
			Input input = new Input();
			input.readText();
		}catch(IOException ioe){
			throw ioe;
			//ioe.printStackTrace();
		}
	}
}
