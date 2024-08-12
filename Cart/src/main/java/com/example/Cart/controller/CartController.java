package com.example.Cart.controller;

import com.example.Cart.core.Cart;
import com.example.Cart.core.Item;
import com.example.Cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
@RestController
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @PostMapping("/buy")
    public ResponseEntity<?> buyGoods(@RequestBody Item item) {
        boolean isBought = cartService.buy(item);
        return null;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Item>> getAll() {
        return ResponseEntity.ok(cartService.getAllItems());
    }
}
