package ioKodlamaOdev3.business;

import ioKodlamaOdev3.dataAccess.hibernate.IInstructorDao;
import ioKodlamaOdev3.entities.Instructor;
import ioKodlamaOdev3.logging.ILogger;

public class InstructorManager {
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		this.instructorDao=instructorDao;
		this.loggers=loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (ILogger logger : loggers) {
			logger.log(instructor);
		}
		
	}
	
	

}
