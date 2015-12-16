
public class BaseClass
{
	private final String name;
	private final int age;

	public BaseClass(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		//System.out.println("The name is "+ name);
		return name;
	}
	
	public int getAge()
	{
		//System.out.println("The Age is "+age);
		return age;
	}
}


