package test;

public class person {
	private int Id;
	private String Name;
	private String Add;
	private int Age;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(int id, String name, String add, int age) {
		super();
		Id = id;
		Name = name;
		Add = add;
		Age = age;
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
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
}
