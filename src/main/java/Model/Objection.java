package Model;

public class Objection {
private String objectionType; 
private String objectionInformation;  //this is just a default objection rules explanation for reference with #
private String explanation; 

public Objection(){}; 

public Objection(String type, String oInfo, String exp){
	this.objectionType = type; 
	this.objectionInformation= oInfo; 
	this.explanation = exp; 
	
}

public String getObjectionType() {
	return objectionType;
}
public void setObjectionType(String objectionType) {
	this.objectionType = objectionType;
}
public String getObjectionInformation() {
	return objectionInformation;
}
public void setObjectionInformation(String objectionInformation) {
	this.objectionInformation = objectionInformation;
}
public String getExplanation() {
	return explanation;
}
public void setExplanation(String explanation) {
	this.explanation = explanation;
}


}
