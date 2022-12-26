package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Course;
import ioKodlamaOdev3.entities.Instructor;

public interface IInstructorDao {
	
	void add(Instructor instructor);
	void delete(Instructor instructor);
	void update (Instructor instructor);

}
