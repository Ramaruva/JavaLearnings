package Trees;

import java.util.ArrayList;
import java.util.List;

public class MatchMechTest {
 
	List<Qualification> jobQualification = new ArrayList<Qualification>();
	List<Qualification> professionalQualification = new ArrayList<Qualification>();
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void addValues() {
		jobQualification.add(new Qualification("skills","react"));
		jobQualification.add(new Qualification("framework","springboot"));
		professionalQualification.add(new Qualification("skills","angular"));
		professionalQualification.add(new Qualification("framework","react"));
	
	}
	

}

class Qualification{
	String type;
	String keywords;
	Qualification(String type, String keywords){
		this.type = type;
		this.keywords = keywords;
	}
}