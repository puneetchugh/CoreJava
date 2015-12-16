

public class StringTestClass{

	public static void main(String[] args){

		String string= "My name is Puneet. I am age 25. You can't deny me, you can't defy me";
		System.out.println(string);
		String newString = string.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(newString);
	}
}
