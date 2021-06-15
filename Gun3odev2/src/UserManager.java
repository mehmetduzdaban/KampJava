

public class UserManager {
	public void login(User user) {
		System.out.println("ID :"+user.getId()+" "+user.getFirstName()+" "+user.getLastName()+" sisteme giriþ yaptý.");
	}
	public void logout(User user) {
		System.out.println("ID :"+user.getId()+" "+user.getFirstName()+" "+user.getLastName()+" sistemden çýkýþ yaptý.");
	}
	public void signUp(User user) {
		System.out.println("ID :"+user.getId()+" "+user.getFirstName()+" "+user.getLastName()+" sisteme kayýt yaptý.");
	}
	

}