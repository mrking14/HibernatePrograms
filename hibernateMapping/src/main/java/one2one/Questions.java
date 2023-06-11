package one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Questions {
	@Id
	@Column(name ="question_id")
	private int qId;
	private String question;
	
	@OneToOne
	private Answers answer;
	
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(int qId, String question, Answers answer) {
		super();
		this.qId = qId;
		this.question = question;
		this.answer = answer;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answers getAnswer() {
		return answer;
	}
	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Questions [qId=" + qId + ", question=" + question + ", answer=" + answer.getAnswer() + "]";
	}
	
	
	
	

}
