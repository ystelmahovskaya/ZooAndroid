package com.example.yuliiastelmakhovska.zooandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private Runnable run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        listView = (ListView) findViewById(R.id.ListViewProduct);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1/*, getBranchArray(Main.branches.branches)*/);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);

        run = new Runnable() {
            public void run() {
                reloadProducts();
            }
        };
        reloadProducts();
    }

    public void callAddNewProduct(View v){

        startActivityForResult((new Intent(ProductActivity.this, AddProduct.class)), 1);
    }
    public ArrayList<String> getProductstoStringArray(){
        ArrayList<String> products= new ArrayList<String>();
        for(Product product:Main.branches.branches.get(Main.branches.activeBranch).getListOfProducts()){
            products.add(product.toString());
        }
        return products;
    }
    public void reloadProducts() {
        adapter.clear();
        adapter.addAll(getProductstoStringArray());
        adapter.notifyDataSetChanged();
        listView.invalidateViews();
        listView.refreshDrawableState();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                runOnUiThread(run);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }//onActivityResult

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("edit");
        menu.add("delete");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
    AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        if (item.getTitle() == "edit") {
            Toast.makeText(this, "Action 1 invoked", Toast.LENGTH_SHORT).show();

        }
        else if (item.getTitle() == "delete") {
            Toast.makeText(this, "deleted", Toast.LENGTH_SHORT).show();
            Main.branches.branches.get(Main.branches.activeBranch).getListOfProducts().remove(info.position);
            try {
                Main.branches.printToFile(this,Main.branches.branches.get(Main.branches.activeBranch) );
                reloadProducts();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            return false;
        }
        return true;
    }




}
