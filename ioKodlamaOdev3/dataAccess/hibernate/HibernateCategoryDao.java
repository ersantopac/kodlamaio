package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Hibernate eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori Hibernate silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Kategori Hibernate güncellendi");
		
	}

}
