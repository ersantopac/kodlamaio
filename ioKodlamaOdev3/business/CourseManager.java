package ioKodlamaOdev3.business;

import ioKodlamaOdev3.dataAccess.hibernate.ICourseDao;
import ioKodlamaOdev3.entities.Course;
import ioKodlamaOdev3.logging.ILogger;

public class CourseManager {

	private ICourseDao courseDao;
	private ILogger[] loggers;

	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers=loggers;

	}
	
	public void add(Course course) throws Exception {
		 String nameControl="c##";
		
		if (course.getPrice()<0) {
			//throw new Exception("Ürün fiyatı 0'dan küçük olamaz");
			System.out.println("Ürün fiyatı 0'dan küçük olamaz");			
		}
		if (course.getCourseName().equals(nameControl)) {
			System.out.println("aynı isimle kurs olamaz");
		}
		
		courseDao.add(course);
		for (ILogger logger : loggers) {
			logger.log(course);
		}
	}

}
