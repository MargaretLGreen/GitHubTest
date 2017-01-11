
public class ParentChildDemo {

	public static void main(String[] args) {
		// declare variables
		ParentClass bob = new ParentClass();
		ChildClass joey = new ChildClass();
		
		bob.setName("Bob");
		bob.setAge(35);
		
		joey.setName("Joey");
		joey.setAge(12);
		joey.setGrade(6);
		
		System.out.println("Parent name: " 
		   + bob.getName() + " age: " + bob.getAge());
		System.out.println("Child name: "
			+ joey.getName() + " age: " +
			joey.getAge() + " grade: " + joey.getGrade());

	}

}
