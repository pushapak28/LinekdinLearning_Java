import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String question = "Which is the largest planet in our solar system";
		String choiceOne = "earth";
		String choiceTwo = "jupiter";
		String choiceThree = "saturn";
		
		String correctAnswer = choiceTwo;
		
		System.out.println(question);
		
		System.out.println("Choose one of the following: " + choiceOne+" , "+ choiceTwo+", or "+choiceThree+".");
		
		String input = sc.nextLine();
		
		if(correctAnswer.equals(input.toLowerCase())) {
			System.out.println("Congrats! That's the correct answer");
		}else {
			System.out.println("You are incorrect. The Correct answer is "+choiceTwo);
		}
		
		sc.close();
	}

}
