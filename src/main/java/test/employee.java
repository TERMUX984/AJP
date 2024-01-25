package test;

public class employee {
	private int Id;
	private String Name;
	private String salary;
	public employee(int id, String name, String salary) {
		super();
		Id = id;
		Name = name;
		this.salary = salary;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
