package Control;
import Model.Question;
import Model.Objection;
import Model.Transcript;
import Model.Witness;

import java.util.List; 
import Model.databaseInformation;

public interface DataBaseServicesTemplate {
	public List<Question> getQuestions(); 
	public Question getQuestion(); 
	}
