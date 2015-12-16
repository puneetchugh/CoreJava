

public class LearnArraySize{

	public String[] myString;
	public LearnArraySize(){
		
		myString = new String[10];
	}

	public static void main(String[] args){

		LearnArraySize learnArraySize = new LearnArraySize();

		learnArraySize.myString[0] = "puneet";
		learnArraySize.myString[1] = "chugh";
		learnArraySize.myString[2] = "kaku";

		System.out.println(learnArraySize.myString.length);
	}
}
