
public class MultipleChoice extends Question
{
	private String[] answerChoices;
	private char correctAnswer;
	
	public MultipleChoice(String text, String[] answerChoices, char correctAnswer)
	{
		super(text);
		this.answerChoices = answerChoices;
		this.correctAnswer = correctAnswer;
	}
	
	public String toString()
	{
		String ques = "";
		ques += getNumber() + ". " + getText() + "\n";
		char choice = 'A';
		for(String ans : answerChoices)
		{
			ques += "\t" + choice + ". " + ans + "\n";
			choice++;	//can increment because it is a primitive data type
		}
		return ques;
	}
	
	public String getSolution()
	{
		return "Correct Answer: " + correctAnswer;
	}
}
