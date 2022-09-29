package experiment_abstract;

public class SingleSelectQuestion extends Question {
	private String[] AnswerChoices;
	private int maxSelectable;
	
	public int setAnsChoices(String[] x) {

		this.AnswerChoices = x;
		this.maxSelectable = 1;

		return 1;
	}

	public int getMaxSelectable() {
		return this.maxSelectable;
	}

	public String[] getAnsChoices() {
		return this.AnswerChoices;
	}

}
