
public interface Question {
	public void setQuestion(String x);
	public int setAnsChoices(String[] x);
	
	public String getQuestion();
	public int getMaxSelectable();
	public String[] getAnsChoices();
}
