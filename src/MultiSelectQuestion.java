
public class MultiSelectQuestion implements Question {
	private String Question;
	private String[] ansChoices;
	private int maxAnsChoices;
	
	
	@Override
	public void setQuestion(String x) {
		this.Question = x;
	}

	@Override
	public int setAnsChoices(String[] x) {
		this.maxAnsChoices = x.length;
		this.ansChoices = x;
		
		return 1;
	}

	@Override
	public String getQuestion() {
		return this.Question;
	}

	@Override
	public int getMaxSelectable() {
		return this.maxAnsChoices;
	}

	@Override
	public String[] getAnsChoices() {
		return this.ansChoices;
	}

}
