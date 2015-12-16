

public class checkStringInput{

	public static void main(String[] args){
		
		String[] newString = {"puneet","chugh"};

		for(String individualString:newString){
			
			System.out.println(individualString);
		}

		System.out.println("The size of the array is"+Integer.toString(newString.length));
	}
}
