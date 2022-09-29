package experiment_abstract;

abstract class Question {
	private String Question;	
	public void setQuestion(String x)
	{
		x = this.Question;
	};
	
	public String getQuestion() {
		return this.Question;
	}
	
	abstract int getMaxSelectable();
	abstract String[] getAnsChoices();
	abstract int setAnsChoices(String[] x);
	
}
