public class StudentManager extends UserManager{
	public void addToComment(Student student) {
		System.out.println("ID :"+student.getId()+" "+student.getFirstName()+" "+student.getLastName()+" yorum yaptý. "+student.getComment());
	}
	public void removeToComment(Student student) {
		System.out.println("ID :"+student.getId()+" "+student.getFirstName()+" "+student.getLastName()+" yorumu sildi. "+student.getComment());
	}

}