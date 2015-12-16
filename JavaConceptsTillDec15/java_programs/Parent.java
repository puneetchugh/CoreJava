

public class Parent{
	
	private int age;
	private String name;

	public Parent(int age, String name){
		
		this.age = age;
		this.name = name;
	}

	abstract public String getName(); //{
	/*	String name = String.format("The name of the parent is %s", this.name );
		System.out.println(name);
		return (this.name);*/
//	}

	public int getAge(){

		return(age);
}
	

}
