public class Student extends User {
	private String comment;

	public Student(int id, String firstName, String lastName, String email, String password, String commend, String comment) {
		super();
		this.comment = comment;
	}
	
	public Student() {
		
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	

}