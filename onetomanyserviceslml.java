package com.prasuna.servicelml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import com.prasuna.entity.Category;
import com.prasuna.repository.CategoryRepository;

public interface onetomanyserviceslml extends onetomanyservice{
	@Autowired
	 private CategoryRepository repository ;
	 public default List<Category>findpaginated(int pageNo,int pageSize){
		 pageable paging=PageRequest.of(pageNo, pageSize);
		 page<Category>pagedResult=repository.findAll(paging);
		 return pagedResult.toList();
	 }
	 @Override
	 Public Category update(Category category) {
		 return repository.save(Category);
		 
	 }
	 
	 

}
