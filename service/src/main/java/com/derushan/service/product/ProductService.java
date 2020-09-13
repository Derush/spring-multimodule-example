/**
 * 
 */
package com.derushan.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.derushan.dao.product.ProductRepository;
import com.derushan.model.product.Product;

/**
 * @author Derushan
 * Sep 13, 2020
 */
@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> prodcuts){
		return productRepository.saveAll(prodcuts);
	}
	
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "Product deleted Successfully!!!";
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return productRepository.save(existingProduct);
	}
}
