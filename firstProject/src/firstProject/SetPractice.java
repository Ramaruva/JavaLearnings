package firstProject;

import java.util.HashSet;
import java.util.Set;

/*
 * 
 * Sets:
 * a.containsAll(b) subset
 * a.addAll(b) union
 * a.removeAll(b) (difference)
 * a.retainAll(b) (intersection)
 * a.clear()(empty set)
 */
public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> st = new HashSet<>();
		st.add(3);
		st.add(4);
		st.add(4);
		st.add(5);
		st.add(6);
		st.add(0);
		System.out.println(st);
		for(int x:st)
			System.out.println(x);
		
		Set<StudentMarks> stud = new HashSet<StudentMarks>();
		
		stud.add(new StudentMarks(100, 200));
		stud.add(new StudentMarks(23, 345));
		stud.add(new StudentMarks(234, 455));
		stud.add(new StudentMarks(100, 200));
		
		for(StudentMarks x: stud)
			System.out.println(x);
		
		System.out.println(stud.contains(new StudentMarks(100, 200)));

	}

}
