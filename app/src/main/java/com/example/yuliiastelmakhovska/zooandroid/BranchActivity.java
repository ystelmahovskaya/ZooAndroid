package com.example.yuliiastelmakhovska.zooandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BranchActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private Runnable run;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        try {
            Main.branches.loadBranches(this);
            if (Main.branches.branches.size() == 0) {

                startActivity(new Intent(BranchActivity.this, AddBranch.class));
            }
            listView = (ListView) findViewById(R.id.ListView1);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1/*, getBranchArray(Main.branches.branches)*/);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Main.branches.activeBranch=position;
                    startActivity(new Intent(BranchActivity.this, ProductActivity.class));
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        run = new Runnable() {
            public void run() {
                reloadBranches();
            }
        };
        reloadBranches();
    }

    public void reloadBranches() {
        adapter.clear();
        adapter.addAll(getBranchArray(Main.branches.branches));
        adapter.notifyDataSetChanged();
        listView.invalidateViews();
        listView.refreshDrawableState();

    }

    public ArrayList<String> getBranchArray(List<Shop> shops) {
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < shops.size(); i++) {
            array.add(shops.get(i).toString());
        }
        return array;
    }

    public void callAddBranchActivity(View v) {
        startActivityForResult((new Intent(BranchActivity.this, AddBranch.class)), 1);
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
}
