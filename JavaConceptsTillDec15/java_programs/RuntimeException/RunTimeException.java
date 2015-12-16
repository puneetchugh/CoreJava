import java.RuntimeException;

public class RunTimeException{
	
	public static void main(String[] args){
		
		try{
			String[] stringArray = new String[2];
			stringArray[0] = "Puneet";
			stringArray[1] = "Chugh";
			stringArray[3] = "The";
		}

		catch(ArrayOfBoundException arrayOutOfBoundExcep){
			System.out.println("In main() : Array Out Of Bound ");
		}
	}
}
