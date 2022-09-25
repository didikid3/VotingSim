package experiment_composition;

public class QuestionAnswers {
	private int maxAns;
	private String[] ansChoices;
	
	
	public QuestionAnswers() {
		maxAns = 0;
	}
	
	public QuestionAnswers(String[] x, int y) {
		this.ansChoices = x;
		this.maxAns = y;
	}
	public QuestionAnswers(int y, String[] x) {
		this.ansChoices = x;
		this.maxAns = y;
	}
	
	
	public String[] getAnsChoices() {
		return this.ansChoices;
	}
	
	public int getMaxAns() {
		return this.maxAns;
	}
	
	public void setAnsChoices(String[] x) {
		this.ansChoices = x;
	}
	
	public void setMaxAns(int x) {
		this.maxAns = x;
	}
	
}
