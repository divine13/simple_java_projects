public class Student{
	private String name = "Nobody Null";
	private int grade; 
	Student(String name, int grade){
       this.name = name;
       this.grade = grade;
	}

	public void setName(String name){
		this.name = name;
	}
	public String name(){
		return name;
	}

}