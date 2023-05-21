package com.mini.commerce.controller;

import com.mini.commerce.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders/{id}")
    public ResponseEntity<?> getOrder(@PathVariable long id) {
        Order order = new Order(id, "MacBook Air M2", 1);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
