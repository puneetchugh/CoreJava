
public class Son extends BaseClass
{
	private final String hasSingleParent;
	public Son(String name, int age, String hasSingleParent)
	{
		super(name, age);
		this.hasSingleParent = hasSingleParent; 
	}

		@Override
		public String getName()
		{
			System.out.println("The name is"+ this.getName());
			return this.getName();
		}

		@Override
		public int getAge()
		{
			System.out.println("The age is "+ this.getAge());
			return this.getAge();
		}



	public static void main(String[] args)
	{
		Son mySon = new Son("Puneet",25,"yes");
		mySon.getName();
		mySon.getAge();


	}
}

