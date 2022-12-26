package ioKodlamaOdev3.logging;

import ioKodlamaOdev3.entities.Category;
import ioKodlamaOdev3.entities.Course;
import ioKodlamaOdev3.entities.Instructor;

public class JdbcLogger implements ILogger {

	@Override
	public void log() {
		System.out.println("Jdbc loglandı");
		
	}

	@Override
	public void log(Category category) {
		System.out.println("Jdbc kategori loglandı");
		
	}

	@Override
	public void log(Course course) {
		System.out.println("Jdbc kurs loglandı");
		
	}

	@Override
	public void log(Instructor instructor) {
		System.out.println("Jdbc egitmen loglandı");
		
	}

}
