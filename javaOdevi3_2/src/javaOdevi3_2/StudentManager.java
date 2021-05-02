package javaOdevi3_2;

public class StudentManager extends UserManager {
	
	public void addToCourse(Student student) {
		System.out.println(student.getfirstName()+" "+student.getlastName()+" isimli ögrenci"+" "+student.getRegisteredCourses() + " kursuna kaydedildi");
	}
}
