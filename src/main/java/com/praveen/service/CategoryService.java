package com.praveen.service;

import java.util.List;

import com.praveen.entity.Category;

public interface CategoryService {

    public Boolean saveCategory(Category category);
	
	public List<Category> getAllCategory();
}
