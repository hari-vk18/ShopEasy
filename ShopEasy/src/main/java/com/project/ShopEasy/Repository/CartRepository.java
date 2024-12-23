package com.project.ShopEasy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ShopEasy.Model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	Cart findByUserId(Long userId);

}
