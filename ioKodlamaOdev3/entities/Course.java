package ioKodlamaOdev3.entities;

public class Course {
	private int id;
	private String courseName;
	private int instructurId;
	private String description;
	private double price;
	private String image;
	
	private int categoryId;
	private int instructerId;
	
	public Course(int id, String courseName, int instructurId, String description, double price, String image,
			int categoryId, int instructerId) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructurId = instructurId;
		this.description = description;
		this.price = price;
		this.image = image;
		this.categoryId = categoryId;
		this.instructerId = instructerId;
	}

	public Course() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getInstructurId() {
		return instructurId;
	}

	public void setInstructurId(int instructurId) {
		this.instructurId = instructurId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getInstructerId() {
		return instructerId;
	}

	public void setInstructerId(int instructerId) {
		this.instructerId = instructerId;
	}
	
	
	

}
