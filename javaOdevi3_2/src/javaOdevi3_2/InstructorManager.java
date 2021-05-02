package javaOdevi3_2;

public class InstructorManager extends UserManager {
	
	public void addToCourses (Instructor instructor) {
		System.out.println(instructor.getfirstName()+" "+instructor.getlastName()+" "+instructor.getCourses()+" isimli kursu oluşturdu");
	}
}
