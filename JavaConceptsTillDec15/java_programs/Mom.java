

public class Mom extends Parent{
	
	public Mom(int age, String name){
		super(age, name);
	}

	public String getName(){
		System.out.println("The name of the parent is "+super.name);
	}	
	 
//	public String description(){
//		return(this.name);
//	}

	public static void main(String[] args){
	
		Mom myMom = new Mom(59,"Saroj");
		System.out.println("My mom's name is" + myMom.description());
	}
}


