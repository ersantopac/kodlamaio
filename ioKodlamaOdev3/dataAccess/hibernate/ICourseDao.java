package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Category;
import ioKodlamaOdev3.entities.Course;

public interface ICourseDao {
	void add(Course course);

	void delete(Course course);

	void update(Course course);

}
