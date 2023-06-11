package one2one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answers {
	@Id
	private int aId;
	private String answer;
	
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Answers(int aId, String answer, Questions q) {
		super();
		this.aId = aId;
		this.answer = answer;
	}
	
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
	

}
