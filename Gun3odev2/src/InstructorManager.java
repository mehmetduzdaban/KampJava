
public class InstructorManager extends UserManager{
	public void addToHomeWork(Instructor instructor) {
		System.out.println("Eğitmen "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafından "+instructor.getHomeWork()+" ödevleri sisteme yüklendi.");
	}
	

}