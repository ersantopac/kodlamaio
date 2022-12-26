package ioKodlamaOdev3.business;

import ioKodlamaOdev3.dataAccess.hibernate.ICategoryDao;
import ioKodlamaOdev3.entities.Category;
import ioKodlamaOdev3.logging.ILogger;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
	}
	
	public void add(Category category) throws Exception {
		String nameControl="";
		
		if (category.getCategoryName().equals(nameControl)) {
			//System.out.println("Aynı isimle kategory olamaz");
			throw new Exception("ürün fiyatı 10 dan küçük olamaz");
		}
		
		categoryDao.add(category);
		for (ILogger logger : loggers) {
			logger.log(category);
		}
	}
	
	

}
