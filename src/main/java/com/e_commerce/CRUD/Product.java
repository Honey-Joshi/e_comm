package com.e_commerce.CRUD;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.UUID;

@Builder
@Slf4j
@Data
public class Product {
    UUID productId;
    double price;
    String name;
    String description;
}
