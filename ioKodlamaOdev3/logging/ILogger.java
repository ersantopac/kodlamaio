package ioKodlamaOdev3.logging;

import ioKodlamaOdev3.entities.Category;
import ioKodlamaOdev3.entities.Course;
import ioKodlamaOdev3.entities.Instructor;

public interface ILogger {
	void log();
	void log(Category category);
	void log(Course course);
	void log(Instructor instructor);
}
