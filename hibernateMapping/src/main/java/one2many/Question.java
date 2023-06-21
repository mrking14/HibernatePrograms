package one2many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	private int qId;
	private String question;

//	 we used this for defining Loading Method.  like if we want to load joined data before calling "fetch = FetchType.EAGER" else that will be by default Lazy loading method .

//	@OneToMany     --- If You want to add join column in Question table 
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER) // Here if you do not want to create extra column in
																// table.

	private List<Answer> answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qId, String question, List<Answer> answer) {
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

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

}
