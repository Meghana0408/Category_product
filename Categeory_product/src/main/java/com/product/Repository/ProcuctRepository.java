package com.product.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.product.Model.Product;

public interface ProcuctRepository extends  JpaRepository<Product, Integer> {
	Page<Product> findAll(Pageable pageable);


}
