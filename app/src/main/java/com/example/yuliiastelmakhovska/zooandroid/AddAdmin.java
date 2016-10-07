package com.example.yuliiastelmakhovska.zooandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;

public class AddAdmin extends AppCompatActivity {


    public AddAdmin() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addadmin);
    }

    public void CreateFirstAdminUser(View v) throws IOException {

        EditText NameEdit = (EditText) findViewById(R.id.editText);
        String Name = NameEdit.getText().toString();
        EditText userNameEdit = (EditText) findViewById(R.id.editText2);
        String userName = userNameEdit.getText().toString();
        EditText passwordEdit = (EditText) findViewById(R.id.editText5);
        String password = passwordEdit.getText().toString();
        User adminUser = new User(Name, userName, password);
        adminUser.setIsAdmin(true);
        Main.users.usersList.add(adminUser);
        Main.users.saveTofile(this);
        this.finish();
    }

}
