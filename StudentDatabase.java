import java.util.*;
public class StudentDatabase {
	Student[] studentsArray;
	
	int currentIndex = 0;
	
	public StudentDatabase() {
		 studentsArray =  new Student[10];	
	}
	 
	public void addStudent(Student s) {
		 studentsArray[currentIndex] = s;
		 currentIndex ++;
	}
	
	
	public void display() {
		for (int i = 0 ; i < studentsArray.length ; i ++) {
			if(studentsArray[i] != null) {
				System.out.println(studentsArray[i]);
			}
		}
	}
}
