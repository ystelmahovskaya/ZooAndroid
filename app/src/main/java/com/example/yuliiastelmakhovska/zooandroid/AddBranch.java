package com.example.yuliiastelmakhovska.zooandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;

public class AddBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_branch);
    }
    public void createNewBranch(View v) throws IOException {

        EditText NameEdit = (EditText) findViewById(R.id.editText6);
        String Name = NameEdit.getText().toString();
        if (Name.length()==0){
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("empty name field");
            dlgAlert.setTitle("Fail");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }
        else {
            Shop shop= new Shop(Name);
            Main.branches.branches.add(shop);
            Main.branches.printToFile(this,shop);
            Intent returnIntent = new Intent();
            setResult(Activity.RESULT_OK, returnIntent);
            this.finish();
        }
    }
}
