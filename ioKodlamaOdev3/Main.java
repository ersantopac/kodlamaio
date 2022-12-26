package ioKodlamaOdev3;

import ioKodlamaOdev3.business.CourseManager;
import ioKodlamaOdev3.dataAccess.hibernate.HibernateCourseDao;
import ioKodlamaOdev3.entities.Course;
import ioKodlamaOdev3.logging.HibernateLogger;
import ioKodlamaOdev3.logging.ILogger;

public class Main {

	public static void main(String[] args) throws Exception {
		
	ILogger[] loggers= {new HibernateLogger()};
		Course course=new Course(1,"ayni",1,"",1,"",1,1);
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course);

	}

}
