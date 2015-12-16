public class MultipleConstructors1{

	private final int variable1;
	private final int variable2;
	private final String newString;

	public MultipleConstructors1(int variable1, String newString){
		
		this(variable1, newString, 10);
	}

	public MultipleConstructors1(int variable1, String newString, int variable2){
		this.variable1 = variable1;
		this.newString = newString;	
		this.variable2 = variable2;
	}

	public void print(){
		System.out.println(variable1);
		System.out.println(variable2);
	}
	public static void main(String[] args){

		MultipleConstructors1 multipleConstructors = new MultipleConstructors1(100,"puneet");
		multipleConstructors.print();
	}
}
