package com.prasuna.servicelml;

import java.util.List;

import com.prasuna.entity.Category;

public interface onetomanyservice {
	public List<Category>findpaginated(int pageNo,int pageSize);
	public Category update(Category category);

}
