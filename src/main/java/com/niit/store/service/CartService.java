package com.niit.store.service;

import com.niit.store.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
