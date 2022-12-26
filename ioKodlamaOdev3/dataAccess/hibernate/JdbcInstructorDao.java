package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Egitmen Jdbc eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Egitmen Jdbc güncellendi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("egitmen Jdbc güncellendi");
		
	}

}
