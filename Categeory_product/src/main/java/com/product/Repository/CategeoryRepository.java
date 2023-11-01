package com.product.Repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.product.Model.Categeory;

public interface CategeoryRepository extends PagingAndSortingRepository<Categeory, Integer>,CrudRepository<Categeory, Integer>{

	

}
