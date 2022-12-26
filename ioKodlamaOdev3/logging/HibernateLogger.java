package ioKodlamaOdev3.logging;

import ioKodlamaOdev3.entities.Category;
import ioKodlamaOdev3.entities.Course;
import ioKodlamaOdev3.entities.Instructor;

public class HibernateLogger implements ILogger {

	@Override
	public void log() {
		System.out.println("Hibernate Loglandı");
		
	}
	public void log(Category category) {
		System.out.println("Hibernate categori Loglandı");
		
	}
	public void log(Course course) {
		System.out.println("Hibernate kurs Loglandı");
		
	}
	public void log(Instructor course) {
		System.out.println("Hibernate egitmen Loglandı");
		
	}
	
	

}
