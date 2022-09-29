package experiment_abstract;

public class MultiSelectQuestion extends Question {
	private String[] AnswerChoices;
	private int maxSelectable;
	

	@Override
	public int setAnsChoices(String[] x) {
		this.maxSelectable = x.length;
		this.AnswerChoices = x;
		
		return 1;
	}

	@Override
	public int getMaxSelectable() {
		return this.maxSelectable;
	}

	@Override
	public String[] getAnsChoices() {
		return this.AnswerChoices;
	}

}
