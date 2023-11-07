package firstProject;

/**
 * 
 */
public class StudentMarks implements Comparable<StudentMarks>{
    private int Maths;
    private int science;
	public StudentMarks(int maths, int science) {
		Maths = maths;
		this.science = science;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	@Override
	public String toString() {
		return "StudentMarks [Maths=" + Maths + ", science=" + science + "]";
	}
	@Override
	public int compareTo(StudentMarks o) {
		// TODO Auto-generated method stub
		return o.Maths-this.Maths;
	}
	
    
}
