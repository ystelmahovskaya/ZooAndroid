package com.example.yuliiastelmakhovska.zooandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }
    public void callAddNewProduct(View v){

        startActivityForResult((new Intent(ProductActivity.this, AddProduct.class)), 1);
    }
}
