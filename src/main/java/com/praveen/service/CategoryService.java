package com.praveen.service;

import java.util.List;

import com.praveen.dto.CategoryDto;
import com.praveen.dto.CategoryResponse;
import com.praveen.entity.Category;

public interface CategoryService {

    public Boolean saveCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getAllCategory();
	
	public List<CategoryResponse> getActiveCategory();

	public CategoryDto getCategoryById(Integer id);

	public Boolean deleteCategory(Integer id);
}
