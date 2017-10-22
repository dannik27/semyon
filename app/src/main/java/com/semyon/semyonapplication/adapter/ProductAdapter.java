package com.semyon.semyonapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.semyon.semyonapplication.component.ProductPanel;
import com.semyon.semyonapplication.entity.Product;

import java.util.ArrayList;
import java.util.List;


public class ProductAdapter extends BaseAdapter {

    private Context context;
    private List<Product> products;
    private LayoutInflater inflater;


    public ProductAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public Product getProduct(int position){
        return products.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return new ProductPanel(context, getProduct(position));
    }
}
