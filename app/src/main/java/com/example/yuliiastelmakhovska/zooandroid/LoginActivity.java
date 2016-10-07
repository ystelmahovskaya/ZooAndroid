package com.example.yuliiastelmakhovska.zooandroid;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Main.users.loadUsers(this);
            if(Main.users.usersList.size()==0){
                startActivity(new Intent(LoginActivity.this, AddAdmin.class));


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onLogin(View v) throws IOException {

        EditText userNameEdit   = (EditText)findViewById(R.id.editText3);
        String userName = userNameEdit.getText().toString();
        EditText passwordEdit   = (EditText)findViewById(R.id.editText4);
        String password = passwordEdit.getText().toString();
        boolean access = Main.users.myLogin(userName, password);

        if(access){
            startActivity(new Intent(LoginActivity.this, BranchActivity.class));
        }
        else{
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Login fail");
            dlgAlert.setTitle("Fail");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }
    }
}
