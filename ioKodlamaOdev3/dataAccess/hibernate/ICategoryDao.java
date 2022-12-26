package ioKodlamaOdev3.dataAccess.hibernate;

import ioKodlamaOdev3.entities.Category;

public interface ICategoryDao {
	
	void add(Category category);
	void delete(Category category);
	void update (Category category);

}
