package javaOdevi3_2;

public class Main {

	public static void main(String[] args) {
		
		
		Student student =new Student();
		student.setfirstName("Murat");
		student.setlastName("Ozer");
		student.setRegisteredCourses("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		Instructor instructor =new Instructor();
		instructor.setfirstName("Engin");
		instructor.setlastName("Demirog");
		instructor.setCourses("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");

		StudentManager studentManager =new StudentManager();
		studentManager.addToCourse(student);
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.addToCourses(instructor);

	}

}
