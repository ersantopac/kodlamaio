package ioKodlamaOdev3.entities;

public class Instructor {
	private int instructerId;
	private String name;
	private String lastName;
	private String image;
	
	public Instructor() {
		
	}

	public Instructor(int instructerId, String name, String lastName, String image) {
		super();
		this.instructerId = instructerId;
		this.name = name;
		this.lastName = lastName;
		this.image = image;
	}

	public int getInstructerId() {
		return instructerId;
	}

	public void setInstructerId(int instructerId) {
		this.instructerId = instructerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	

}
