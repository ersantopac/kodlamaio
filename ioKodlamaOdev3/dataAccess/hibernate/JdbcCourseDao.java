package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs Jdbceklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Kurs Jdbc silindi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Kurs Jdbc güncellendi");
		
	}

}
