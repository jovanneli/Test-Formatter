
public abstract class Question
{
	private static int nextNum = 1;
	private int number;
	private String text;
	
	public Question(String text)
	{
		this.number = nextNum;
		this.text = text;
		nextNum++;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();

}
