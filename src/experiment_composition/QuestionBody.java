package experiment_composition;

public class QuestionBody {
	private String message;
	
	public QuestionBody(String x)
	{
		this.message = x;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String x) {
		this.message = x;
	}
}
