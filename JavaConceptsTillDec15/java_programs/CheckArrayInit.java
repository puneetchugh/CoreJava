

public class CheckArrayInit
{
	public static void main(String[] args)
	{
		int[] integer = new int[args.length];
		String[] string = new String[2];

		System.out.println("The size of integer array is "+ args.length);
		string = args[0].split(",");
		System.out.println("The first element is "+ string[0]);
		System.out.println("The second element is "+ string[1]);

		System.out.println("The length of the integer : sept 16 is "+integer.length);
		int puneet_int = 1;
		puneet_int = puneet_int<<1;
		System.out.println("The value of the puneet_int is "+puneet_int);

		char my_char = (char) ((puneet_int & 0x31)+ 63);
		System.out.println("The value of my_char is "+my_char);
		my_char = 0;
		System.out.println("The value of my_char is "+(int)my_char);
	
		BigDecimalDemo demo = new BigDecimalDemo();
	}
}
