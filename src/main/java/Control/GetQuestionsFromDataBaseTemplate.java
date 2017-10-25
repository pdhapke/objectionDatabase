package Control;
import Model.Question;
import Model.Objection;
import Model.Transcript;
import Model.Witness;
import Model.databaseInformation;
import java.util.List; 

public interface GetQuestionsFromDataBaseTemplate {
	public List<Question> getQuestions(); 
	public Question getQuestion(); 
	}
