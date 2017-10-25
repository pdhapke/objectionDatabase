package Model.beans;
import Model.*; 
import java.util.List; 


public interface QuestionList {
	public int size(); 
	public void delete (int questionID);
	public void add(Question question); 
	public void randomize(); 	
	public void getUpdate(); 
}
	
