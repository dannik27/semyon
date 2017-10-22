package com.semyon.semyonapplication.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.semyon.semyonapplication.R;
import com.semyon.semyonapplication.entity.Product;

/**
 * Created by danya on 22.10.2017.
 */

public class ProductPanel extends RelativeLayout{

    private Product product;

    private TextView tvId;
    private TextView tvName;
    private TextView tvCount;
    private TextView tvDesc;


    public ProductPanel(Context context, Product product) {
        super(context);

        this.product = product;
        initView();

    }

    private void initView(){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_product_panel, this);

        tvId = (TextView) findViewById(R.id.tvId);
        tvName = (TextView) findViewById(R.id.tvName);
        tvCount = (TextView) findViewById(R.id.tvCount);
        tvDesc = (TextView) findViewById(R.id.tvDesc);

        tvId.setText(String.valueOf(product.getId()));
        tvName.setText(product.getName());
        tvDesc.setText(product.getDescription());
        tvCount.setText(String.valueOf(product.getCount()));
    }

}
