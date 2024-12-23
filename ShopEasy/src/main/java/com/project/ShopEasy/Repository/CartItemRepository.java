package com.project.ShopEasy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ShopEasy.Model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

	void deleteAllByCartId(Long id);

}
