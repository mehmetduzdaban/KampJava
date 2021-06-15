public class Instructor extends User{
	private String homeWork ;
	

	public Instructor(int id, String firstName, String lastName, String email, String password, String homeWork) {
		super();
		this.homeWork = homeWork;
	}

	public Instructor() {
		
	}

	public String getHomeWork() {
		return homeWork;
	}

	public void setHomeWork(String homeWork) {
		this.homeWork = homeWork;
	}
	

}