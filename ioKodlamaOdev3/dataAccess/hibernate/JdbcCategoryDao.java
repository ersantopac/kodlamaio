package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Jdbc eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori Jdbc silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Kategori Jdbc güncellendi");
		
	}

}
