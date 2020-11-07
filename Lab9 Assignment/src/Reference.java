//Author:Shakamuri Sushma
//Date:11/07/2020
//Desc:Creating getters and setters
public class Reference {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reference(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void reference(String msg)
	{
		System.out.println("I am in reference method "+msg+" "+id+" "+name);
	}

}
