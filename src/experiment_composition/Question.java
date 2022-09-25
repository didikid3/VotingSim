package experiment_composition;

public class Question {
	private QuestionBody body;
	private QuestionAnswers ans = new QuestionAnswers();
	
	public void setQuestion(String x) {
		body = new QuestionBody(x);
	}
	public int setAnsChoices(String[] x) {
		ans.setAnsChoices(x);
		return 1;
	}
	public int setMaxSelectable(int x) {
		ans.setMaxAns(x);
		
		return 1;
	}
	
	public String getQuestion() {
		return body.getMessage();
	}
	public int getMaxSelectable() {
		return ans.getMaxAns();
	}
	public String[] getAnsChoices() {
		return ans.getAnsChoices();
	}
}
