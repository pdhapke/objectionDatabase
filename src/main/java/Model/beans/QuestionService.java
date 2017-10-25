package Model.beans;

import java.util.List;

import Model.*;

public interface QuestionService {
	public void updateScore(boolean correct);
	public void getList(String type, int size);
	public int score();
	public List<Integer> completedQuestions(); 
	public Question getNext(); 
	public Question getLast(); 
	public boolean hasNext(); 
}
