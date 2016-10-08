package com.example.yuliiastelmakhovska.zooandroid;

import android.app.Activity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuliiastelmakhovska on 06/10/16.
 */

public class BranchFactory {
    List<Shop> branches= new ArrayList<Shop>();
    int activeBranch=-1;
    int activeItem=-1;

    public String getAppPath(Activity a) {
        return a.getApplicationContext().getFilesDir().getAbsolutePath();
    }
    final RuntimeTypeAdapterFactory<Product> adapter
            = RuntimeTypeAdapterFactory
            .of(Product.class)
            .registerSubtype(Product.class)
            .registerSubtype(AliveIndividuals.class)

            .registerSubtype(Birds.class)
            .registerSubtype(Spider.class)
            .registerSubtype(Fish.class)
            .registerSubtype(LittleAnimals.class)
            .registerSubtype(Amphibium.class)

            .registerSubtype(Insects.class);
    final Gson gsonProduct = new GsonBuilder().registerTypeAdapterFactory(adapter).create();

    public void loadBranches(Activity a)throws IOException{
        try {

            File folder = new File(getAppPath(a) + File.separator + "branches" + File.separator);

            File listOfFiles[] = folder.listFiles();
            if (listOfFiles != null) {
                System.out.println(folder.listFiles());
                for (File file : listOfFiles) {
                    System.out.println(file);
                }

                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile() && listOfFiles[i].getName().contains("branch_")) {
                        System.out.println(listOfFiles[i].getName());
                        Shop shop = new Shop(listOfFiles[i].getName().substring(7, listOfFiles[i].getName().length() - 5));
                        shop.setListOfProducts(populateListFromFile(listOfFiles[i].getAbsolutePath()));
                        branches.add(shop);
                        }
                }
            }
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public List<Product> populateListFromFile(String filename) throws IOException {
        List<Product> products = new ArrayList<Product>();
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            String strLine;
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
            while ((strLine = br.readLine()) != null) {
                Product product = gsonProduct.fromJson(strLine, Product.class);
                products.add(product);
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return products;
    }
    public void printToFile(Activity a, Shop shop) throws IOException {

        String filename = "branch_" + shop.getBranchName() + ".json";
        String folder = getAppPath(a) + File.separator + "branches" + File.separator;
        //try {
        File f = new File(folder);
        if (f != null) {
            f.mkdirs();
        }

        FileWriter fw = new FileWriter(folder + filename);
        BufferedWriter bfw = new BufferedWriter(fw);

        for (Product product : shop.getListOfProducts()) {
            bfw.write(gsonProduct.toJson(product, Product.class));
            bfw.newLine();
        }
        bfw.close();
//        } catch (Exception e) {
//            System.out.println("File writing error");
//        }
    }
}
