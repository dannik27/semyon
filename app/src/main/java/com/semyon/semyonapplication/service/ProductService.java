package com.semyon.semyonapplication.service;

import com.semyon.semyonapplication.entity.Product;

import java.util.Arrays;
import java.util.List;

/**
 * Created by danya on 22.10.2017.
 */

public class ProductService {

    public List<Product> findAll(){
        List<Product> res = Arrays.asList(
                new Product(1, "Важная штука", "Важная штуковина для использования много где", 100),
                new Product(2, "sdasdasd", "Важная штуковина для использования много где", 56),
                new Product(3, "fdgrtyeryer", "Важная штуковина для использования много где", 21),
                new Product(4, "vcbcbsde", "Важная штуковина для использования много где", 544),
                new Product(5, "Вdsfsxа", "Важная штуковина для использования много где", 12),
                new Product(6, "Ваda", "Важная штуковина для использования много где", 45),
                new Product(5, "vcbВdsfsxа", "Важная штуковина для использования много где", 12),
                new Product(6, "Ваdasda", "Важная штуковина для использования много где", 45)
        );
        return res;
    }
}
