public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Mehmet");
		instructor.setLastName("Düzdaban");
		instructor.setHomeWork("5-30 arasýndaki videoları izleyin ve uygulayın");
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Engin");
		student.setLastName("DOGAN");
		student.setComment("Çok faydalý ve baþarýlý bir ders oldu.");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.addToHomeWork(instructor);
		instructorManager.logout(instructor);
		
		System.out.println("*********************");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.addToComment(student);
		studentManager.logout(student);
		

	}

}