/**
 * Parent Class for adding to with GitHub
 * @author greenml
 *
 */
public class ParentClass {
	private String name; // holds name of parent object
	private int age;	 // holds age of parent object
   private double income; // adding income field for parent
   // just adding a comment
   
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
   public void setIncome(double income){
      this.income = income;
   }
   
   public double getIncome()  {
      return income;
   }
	
	

}
