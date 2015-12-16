import java.io.IOException; 

public class LearnException{
	
	public static void main(String[] args){
		
		LearnException learnException = new LearnException();
		try{
			System.out.println(learnException.method());
		}

		catch(IOException e){
			System.out.println(e);
		}
	}
	
	public int method() throws IOException{
		
		//try{
			throw new IOException();

		//}
	/*	catch(IOException e){
			System.out.println(e);
			return 2;
		}
	
		finally{
			return 3;
		}*/
	}
}
