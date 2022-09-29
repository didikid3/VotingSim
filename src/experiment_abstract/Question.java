package experiment_abstract;

abstract class Question {
	private String Question;
	private String[] AnswerChoices;
	private int maxSelectable;
	
	public void setQuestion(String x)
	{
		x = this.Question;
	};
	
	public String getQuestion() {
		return this.Question;
	}
	
	public int getMaxSelectable()
	{
		return this.maxSelectable;
	}
	public String[] getAnsChoices()
	{
		return this.AnswerChoices;
	}
	
	abstract int setAnsChoices(String[] x);
	
}
