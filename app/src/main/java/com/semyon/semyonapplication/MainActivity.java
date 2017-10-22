package com.semyon.semyonapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.semyon.semyonapplication.adapter.ProductAdapter;
import com.semyon.semyonapplication.entity.Product;
import com.semyon.semyonapplication.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView productList;

    ProductService productService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productService = new ProductService();

        productList = (ListView) findViewById(R.id.productList);

        List<Product> products = productService.findAll();
        ProductAdapter productAdapter = new ProductAdapter(products, this.getApplicationContext());
        productList.setAdapter(productAdapter);

    }
}
