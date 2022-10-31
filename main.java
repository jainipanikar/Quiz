import java.util.*;

public class main {

	public static void manString(String [] args) {
		
		String q1 = "What's the name of the river that runs through Egypt?\n" + "(a)Amazon\n(b)The Nile\n(c)Mississippi\n";
		
		String q2 = "How many days are in leap year?\n" + "(a) 366\n(b)365\n(c)364";
		
		String q3 = "What is Sweden's capital city?\n" + "(a) Malmo\n(b)Uppsala\n(c)Stockholm\n";
		
		String q4 = "What is India's capital city?\n" + "(a)Delhi\n(b)Mumbai\n(c)Chennai\n";
		
		String q5 = "What is Spain's capital city?\n" + "(a)Barcelona\n(b)Madrid\n(c)Valencia\n";
		
		String q6 = "What is the closest planet to the sun?\n" + "(a)Venus\n(b)Earth\n(c)Mercury\n";
		
		String q7 = "What is a baby kangaroo called?\n" + "(a)Joey\n(b)Bob\n(c)Mate\n";
		
		String q8 = "Which animal lays the largest eggs?\n" + "(a)Duck\n(b)Eagle\n(c)Ostrich\n";
		
		String q9 = "How many Continents are there?\n" + "(a)Seven\n(b)Eight\n(c)Six\n";
		
		String q10 = "How many colors of the rainbow are there?\n" + "(a)Eight\n(b)Seven\n(c)ten\n";
		
		Question [] questions = {
				new Question(q1, "b"),
				new Question(q2, "a"),
				new Question(q3, "c"),
				new Question(q4, "a"),
				new Question(q5, "b"),
				new Question(q6, "c"),
				new Question(q7, "a"),
				new Question(q8, "c"),
				new Question(q9, "a"),
				new Question(q10, "b")
				
				
		};
		
		takeTest(questions);
		
			 
		}
	public static void takeTest(Question [] questions) {
		int score = 0;
		
		 Scanner keyboradInput = new Scanner(System.in);
		 
		 for(int i= 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboradInput.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
				
			}
			
		 
	}
		 System.out.println( "you got" + score + "/" + questions.length);
	 }
}
