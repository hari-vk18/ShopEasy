package com.project.ShopEasy.Service.product;

import java.util.List;

import com.project.ShopEasy.DTOs.ProductDto;
import com.project.ShopEasy.Model.Product;
import com.project.ShopEasy.request.AddProductRequest;
import com.project.ShopEasy.request.UpdateProductRequest;

public interface IProductService {

	Product addProduct(AddProductRequest product);

	Product getProductById(Long id);

	void deleteProductById(Long id);

	Product updateProductById(UpdateProductRequest product, Long productId);

	List<Product> getAllProducts();

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByBrand(String brand);

	List<Product> getProductsByCategoryAndBrand(String category, String brand);

	List<Product> getProductsByName(String name);

	List<Product> getProductsByNameAndBrand(String name, String brand);

	Long countProductsByBrandAndName(String brand, String name);

	ProductDto convertToDto(Product product);

	List<ProductDto> getConvertedDto(List<Product> products);

}
