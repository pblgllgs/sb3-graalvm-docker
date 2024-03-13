package com.pblgllgs.graalvm.service;

import com.pblgllgs.graalvm.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *
 * @author pblgl
 * Created on 13-03-2024
 *
 */
@Service
public class ProductService {

    public List<Product> getProducts(){
        Product product1 = Product.builder()
                .id(1L)
                .name("PC")
                .build();
        Product product2 = Product.builder()
                .id(2L)
                .name("TV")
                .build();
        return List.of(product1,product2);
    }
}
