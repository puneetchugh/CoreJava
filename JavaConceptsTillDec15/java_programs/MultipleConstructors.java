
public class MultipleConstructors{

	private final int variable1;
	private final int variable2;
	private final String newString;

	public MultipleConstructors(int variable1, String newString){
		
		this(variable1, 10);
		this.variable1 = variable1;
		this.newString = new String(newString);
	}

	public MultipleConstructors(int variable1, int variable2){
		
		this.variable2 = variable2;
	}

	public void print(){
		System.out.println(variable1);
		System.out.println(variable2);
	}
	public static void main(String[] args){

		MultipleConstructors multipleConstructors = new MultipleConstructors(100,"puneet");
		multipleConstructors.print();
	}
}
