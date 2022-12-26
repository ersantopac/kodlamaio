package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs Hibernate eklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Kurs Hibernate silindi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Kurs Hibernate güncellendi");
		
	}

}
