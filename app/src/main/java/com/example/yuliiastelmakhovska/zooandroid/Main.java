package com.example.yuliiastelmakhovska.zooandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {
    public static UsersFactory users = new UsersFactory();
    public static BranchFactory branches = new BranchFactory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
