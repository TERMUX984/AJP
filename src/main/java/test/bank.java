 package test;

public class bank {
	private int Id;
	private String Name;
	private String Add;
	
	public bank() {
		super();
		
	}

	public bank(int id, String name, String add) {
		super();
		Id = id;
		Name = name;
		Add = add;
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
	
}
