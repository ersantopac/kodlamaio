package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Egitmen Hibernate eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Egitmen Hibernate silindi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Egitmen Hibernate güncellendi");
		
	}

}
