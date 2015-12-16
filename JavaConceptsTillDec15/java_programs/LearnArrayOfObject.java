

public class LearnArrayOfObject{

	private final int value;

	public LearnArrayOfObject(int value){

		this.value = value;
	}

	public static void main(String[] args){

		LearnArrayOfObject[] learnArrayOfObject = new LearnArrayOfObject[10];
		learnArrayOfObject[0] = new LearnArrayOfObject(10);
	}
}
