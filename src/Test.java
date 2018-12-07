import java.util.ArrayList;

public class Test 
{

	public static void main(String[] args) 
	{
		
		String[] ans = {"4", "5", "1", "7"};
		
		MultipleChoice question1 = new MultipleChoice("What is 2+2?", ans, 'A');
		
		TrueFalse question2 = new TrueFalse("2 is greater than 4.", "false");
		
		ArrayList<Question> test = new ArrayList<Question>();
		test.add(question1);
		test.add(question2);
		for(Question q: test)
		{
			System.out.println(q);
		}
		
	}

}
