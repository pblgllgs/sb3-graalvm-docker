package com.pblgllgs.graalvm.controller;

import com.pblgllgs.graalvm.entity.Product;
import com.pblgllgs.graalvm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *
 * @author pblgl
 * Created on 13-03-2024
 *
 */
@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getProducts();
    }
}
