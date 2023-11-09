package firstProject;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(Maths, science);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentMarks other = (StudentMarks) obj;
		return Maths == other.Maths && science == other.science;
	}
	
	
	
    
}
