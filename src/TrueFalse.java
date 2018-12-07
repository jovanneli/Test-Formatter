
public class TrueFalse extends Question
{
	public String answer;
	
	public TrueFalse(String text, String answer)
	{
		super(text);
		this.answer = answer;
	}
	
	public String toString()
	{
		return getNumber() + ". TRUE/FALSE: " + getText();
		
	}
	
	public String getSolution()
	{
		return "Correct Answer: " + answer;
	}
}
