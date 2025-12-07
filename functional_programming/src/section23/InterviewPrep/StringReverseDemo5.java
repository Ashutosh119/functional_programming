package section23.InterviewPrep;



public class StringReverseDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Hello Java";
		String [] charStr = input.split("");
		for(int i= charStr.length-1; i>=0; --i) {
			System.out.print(charStr[i]);
		}

	}

}
