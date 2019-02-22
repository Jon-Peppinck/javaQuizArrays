import java.util.Scanner;

public class QuizDemo {

	public static void main(String[] args) {
		//Create a Scanner object to read input
		Scanner keyboard = new Scanner (System.in);
		// Create a char array with 10 elements to be filled by the user
	    final int NUM_QUESTIONS = 10;
	    char[] studentsAnswers = new char[NUM_QUESTIONS];
	    // Greeting instructions
	    System.out.println("Please enter your answer (a, b, c, d) for each question.");
	    // The user will be required to enter a/A, b/B, c/C, d/D for each question
	    int i = 0;
	    while (i < studentsAnswers.length) {
	    	System.out.print("Question " + (i+1) +": ");
	    	char currentAnswer = keyboard.next().charAt(0);
	    	// convert to upper case
	    	char currentAnswerUpper = Character.toUpperCase(currentAnswer);
	    	// add the current answer (Upper case) to students answers array
	    	if (currentAnswerUpper == 'A' || currentAnswerUpper == 'B' || currentAnswerUpper == 'C' || currentAnswerUpper == 'D') {
	    		studentsAnswers[i] = currentAnswerUpper;
	    		i++;
	    	}  	
	    } 
    	// Declare and instantiate a Quiz object
		Quiz quizResults = new Quiz(studentsAnswers);
		// Output incorrect questions to the console
		int[] incorrectQuestionNumbers = quizResults.incorrectQuestions();		
		System.out.println("The following questions are incorrect:");
		for (int j = 0; j < incorrectQuestionNumbers.length; j++) {	
			if (incorrectQuestionNumbers[j] != 0) {
			System.out.print(incorrectQuestionNumbers[j]+1+ " ");
			}
		}		
	}
}