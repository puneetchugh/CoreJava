public class SecondClass extends FirstClass{

/*	@Override
	public void setName(){
		super.name = "Puneet";
	}*/

	@Override
	public String getName(){
		System.out.println(super.getName());
		return(super.getName());
	}
	public void function(){

	}

	public static void main(String[] args){
		SecondClass testClass = new SecondClass();
		testClass.getName();
	}
}
