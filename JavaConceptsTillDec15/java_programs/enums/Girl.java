public class Girl{
	public Type type = Type.girl;

	public void getType(){
		System.out.println("The type is "+ type);
	}

	public static void main(String[] args){
		
		Girl myGirl = new Girl();
		myGirl.type = Type.girl;
		myGirl.getType();
	}	
}
