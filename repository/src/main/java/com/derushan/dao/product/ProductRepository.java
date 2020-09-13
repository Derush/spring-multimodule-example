/**
 * 
 */
package com.derushan.dao.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.derushan.model.product.Product;

/**
 * @author Derushan
 * Sep 13, 2020
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{

	/**
	 * @param name
	 * @return
	 */
	Product findByName(String name);

}
