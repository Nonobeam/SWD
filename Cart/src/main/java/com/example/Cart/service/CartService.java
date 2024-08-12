package com.example.Cart.service;

import com.example.Cart.core.Item;
import com.example.Cart.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;

    public boolean buy(Item item) {
        return false;
    }

    public List<Item> getAllItems() {
        return null;
    }
}
