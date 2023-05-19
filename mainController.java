package com.prasuna.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prasuna.entity.Category;
import com.prasuna.repository.CategoryRepository;
import com.prasuna.repository.ProductRepository;

@RestController
public class mainController {
	@Autowired
	CategoryRepository crepo;
	@Autowired
	ProductRepository prepo;
	@GetMapping("/Category/{pageNo}/{pageSize}")
	public List<Category>getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
		return one.findpaginatated(pageNo,pageSize);
	}
	//sorting in Desc
	@GetMapping("/sorting")
	public Iterable<Category>getAllcols(@RequestParam String field1){
		return crepo.findAll(Sort.by(Direction.DESC,field1));
	}
	//sorting in asc
	@GetMapping("/sorting")
	public Iterable<Category>getAllcols1(@RequestParam String field1){
		return crepo.findAll(Sort.by(Direction.ASC,field1));
	}
	

}
