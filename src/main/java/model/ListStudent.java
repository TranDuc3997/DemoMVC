package model;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	List<Student> list = new ArrayList<>();

	public ListStudent() {
	
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	public Student searchStudent(String masosv) {
		for(Student student: list) {
			if(masosv.equals(student.getID()))
				return student;
		}
		return list.get(0);
	}

}
