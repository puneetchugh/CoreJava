
public class StringSplit
{
	public static String string = new String("My name is Puneet Chugh");
	
	//System.out.println(String[] new_string = string.split(" "));

	public static void main(String[] args)
	{
		String[] many_strings = new String[]{"","","","","",""};
		printf(many_strings = string.split(" "));
	}
	public static void printf(String[] strings)
	{
		System.out.println(strings[0]);
		System.out.println(strings[1]);
		System.out.println(strings[2]);
	}
}
