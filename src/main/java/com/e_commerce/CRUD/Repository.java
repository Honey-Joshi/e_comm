package com.e_commerce.CRUD;

import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

@org.springframework.stereotype.Repository
public class Repository {

    HashMap<Product,Long> hm = new HashMap<>();

    public Product insert()
    {
        Product p = Product.builder().productId(UUID.randomUUID()).name("abcd").build();
        hm.put(p,hm.getOrDefault(p,0L)+1);
        return p;
    }

}
