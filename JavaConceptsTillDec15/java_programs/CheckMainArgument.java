

public class CheckMainArgument
{
	public static void main(String[] args)
	{
		System.out.println("The number of arguements are "+ args.length);
		System.out.println("The first argument "+args[0]);
		System.out.println("The second argument "+args[1]);
		String[] argSplit = args[0].split(",");
		System.out.println("The first two argument after split are :"+argSplit[0]+argSplit[1]);
	}
}

