package experiment_abstract;
import java.lang.Math;

public class Driver {

	
	private static boolean check(int[] arr, int toCheckValue, int size)
    {
        boolean test = true;
        
        for(int i = 0; i<size; i++) {
        	if(toCheckValue == arr[i])
        		return false;
        }
 
        return test;
    }
	public static void main(String[] args) {
		int studentCount = (int)(Math.random() * 20) + 1;
		int questionType = (int)(Math.random() * 2) + 1;
		
		Question chosenQuestion;
		String questionDesc;
		String[] ansChoices;
		
		//1 is Single
		if(questionType == 1) {
			questionDesc = "Yes or No?";
			ansChoices = new String[2];
			ansChoices[0] = "Yes";
			ansChoices[1] = "No";
			
			chosenQuestion = new SingleSelectQuestion();
		}
		//Else multi selectable
		else {
			questionDesc = "A,B,C,D";
			ansChoices = new String[4];
			ansChoices[0] = "A";
			ansChoices[1] = "B";
			ansChoices[2] = "C";
			ansChoices[3] = "D";
			
			chosenQuestion = new MultiSelectQuestion();
		}
		
		chosenQuestion.setQuestion(questionDesc);
		chosenQuestion.setAnsChoices(ansChoices);

		
		VotingBooth machine = new VotingBooth();
		machine.setQuestion(chosenQuestion);
		
		int[] studentAnswer;
		int maxChoices = chosenQuestion.getMaxSelectable();
		int studentChosen;
		int choice;
		
		for(int i = 0; i < studentCount; i++) {
			Student x = new Student();
			x.setID(String.valueOf(i));
			
			studentChosen = (int)(Math.random() * maxChoices) + 1;
			studentAnswer = new int[studentChosen];
			
			for(int k = 0; k < studentChosen; k++) {
				if(maxChoices > 1) {
					choice  = (int)(Math.random() * maxChoices);
				}
				else {
					choice = (int)(Math.random() * 100)+1;
					if(choice > 50)
						choice = 1;
					else
						choice = 0;
				}
				
				while (!Driver.check(studentAnswer, choice, k)) {
					choice  = (int)(Math.random() * maxChoices);
				}
				studentAnswer[k] = choice;
			}
			

			machine.acceptAns(x, studentAnswer);
		}
		
		String results = machine.getResults();
		System.out.println(results);
		System.out.println("Total Students: " + studentCount);
	}

}
