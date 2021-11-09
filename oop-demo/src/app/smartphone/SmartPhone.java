package app.smartphone;

public class SmartPhone {
	private Integer id;
	
	private String name;
	
	private String system;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public SmartPhone(Integer id, String name, String system) {
		super();
		this.id = id;
		this.name = name;
		this.system = system;
	}

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SmartPhone [id=" + id + ", name=" + name + ", system=" + system + "]";
	}
	
}
