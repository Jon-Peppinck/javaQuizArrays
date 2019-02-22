public class Quiz {
	// Fields
	boolean passed;
	int totalCorrect = 0;
	int totalIncorrect = 0;
	int maxIncorrect;
	char[] userResults;
	int[] incorrectQuestions;
	// Create char array with the 10 correct quiz answers
    char[] correctAnswers = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B' };
	/**
	 * The Constructor is called when an instance of an object is created
	 * @param quizResults - A char array of the answers (A, B, C, D) of a students quiz 
	 */
	Quiz(char[] quizResults) {
		// Tally up correct and incorrect results
		for (int i = 0; i < quizResults.length; i++) {
			maxIncorrect = quizResults.length;
			if (quizResults[i] == correctAnswers[i]) {
				totalCorrect++;
			} else {
				totalIncorrect++;
			}	
		}
		// Display the number of correct and incorrect answers to the user
		System.out.println("Correct answers: " + totalCorrect);
		System.out.println("Incorrect answers: " + totalIncorrect);
		// save the answers the user selected in a char array
		userResults = quizResults;
	}
	/**
	 * The incorrectQuestions method returns all of the incorrect questions
	 * @return incorrectQuestions - returns the incorrect question numbers
	 */
	public int[] incorrectQuestions()
	{
		incorrectQuestions = new int[maxIncorrect];
		for (int i = 0; i < incorrectQuestions.length; i++) {
			if(correctAnswers[i] != userResults[i]) {
				incorrectQuestions[i] = i;
			}		
		}
		return incorrectQuestions;
	}
}