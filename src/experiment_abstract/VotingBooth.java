package experiment_abstract;

import java.util.HashMap;
public class VotingBooth {
	private HashMap<String, int[]> studentAns = new HashMap<String, int[]>();
	private int[] ansChoiceResults;
	private int maxSelectable;
	
	private Question boothQuestion;
	
	public void setQuestion(Question x) {
		this.boothQuestion = x;
		createResultArray();
		this.maxSelectable = x.getMaxSelectable();
	}
	
	private void createResultArray() {
		this.ansChoiceResults = new int[this.boothQuestion.getAnsChoices().length];
	}
	
	private void removeOldAns(String id) {
		for(int i = 0; i < this.studentAns.get(id).length; i ++) {
			this.ansChoiceResults[ this.studentAns.get(id)[i] ] --;
		}
	}
	private void addNewAns(int[] ans) {
		for(int i = 0; i < ans.length; i++) {
			this.ansChoiceResults[ ans[i] ] ++;
		}
	}
	
	public void acceptAns(Student x, int[] ans) {
		
		if( ans.length > this.maxSelectable) {
			System.out.println("Too Many Choices Selected!");
		}
		else {
			String id = x.getID();
			if(this.studentAns.containsKey(id)) {
				removeOldAns(id);
			}
			this.studentAns.put(id, ans);
			addNewAns(ans);
		}
	}
	
	
	public String getResults() {
		String results = "";
		
		for(int i = 0; i < this.ansChoiceResults.length; i++) {
			results += this.boothQuestion.getAnsChoices()[i] + 
					": " + this.ansChoiceResults[i] + "\n";
		}
		results += "Max Selectable Choices: " + this.maxSelectable;
		
		return results;
	}
}
