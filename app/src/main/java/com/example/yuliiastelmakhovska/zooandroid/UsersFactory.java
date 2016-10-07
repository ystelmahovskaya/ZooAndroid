package com.example.yuliiastelmakhovska.zooandroid;

import android.app.Activity;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuliiastelmakhovska on 04/10/16.
 */

public class UsersFactory {
    List<User> usersList = new ArrayList<User>();

    Gson gsonUser = new Gson();

    public String getAppPath(Activity a) {
        return a.getApplicationContext().getFilesDir().getAbsolutePath();
    }

    UsersFactory() {
    }

    public void loadUsers(Activity a) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(getAppPath(a) + "/users.json");
            String strLine;
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));

            while ((strLine = br.readLine()) != null) {
                User user = gsonUser.fromJson(strLine, User.class);
                Log.d("UsersFactory", "in");
                usersList.add(user);
            }
            br.close();

        } catch (FileNotFoundException e) {
            Log.d("UsersFactory", "filenotfound");
        }

    }


    public void saveTofile(Activity a) throws IOException {

        FileWriter fw = new FileWriter(getAppPath(a) + "/users.json");
        BufferedWriter bfw = new BufferedWriter(fw);
        for (User user : Main.users.usersList) {
            String userJson = gsonUser.toJson(user);
            bfw.write(userJson);
            bfw.newLine();
        }
        bfw.close();
    }

    public boolean myLogin(String username, String password) {
        Log.d("UsersFactory", "myLogin: " + username + " pass: " + password);

        for (User user : usersList) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)) {
                return true;
            }
        }
        return false;
    }
}
