package com.example.yuliiastelmakhovska.zooandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class AddProduct extends AppCompatActivity implements OnItemSelectedListener {


    int itemPosition=-1;
    List<String> categories = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerProducts);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        categories.add("Bird");
        categories.add("Fish");
        categories.add("Spider");
        categories.add("Insect");
        categories.add("Little animal");
        categories.add("Amphibium");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        EditText species = (EditText) findViewById(R.id.editTextSpecies);
        EditText fishTemperature = (EditText) findViewById(R.id.editTextFishTemp);
        Switch fishSaltWater= (Switch)findViewById(R.id.switchFishSaltWater);
        EditText spiderHabitat = (EditText) findViewById(R.id.editTextSpiderHabitat);
        Switch spiderVenomous= (Switch)findViewById(R.id.switchSpiderVenomous);
        Switch insectVenomous= (Switch)findViewById(R.id.switchInsectVenomous);
        Switch insectFlying= (Switch)findViewById(R.id.switchInsectFlying);
        EditText littleAnAvarageLife = (EditText) findViewById(R.id.editTextLittAnimLife);
        Switch amphibiumVenomous= (Switch)findViewById(R.id.switchAmphibiumVenomous);
        Switch amphibiumPoisonous= (Switch)findViewById(R.id.switchAmphibiumPoisonous);
        Switch amphibiumSaltWater= (Switch)findViewById(R.id.switchAmphibiumSaltWater);

if(position==0) {
    species.setVisibility(View.VISIBLE);
    fishTemperature.setVisibility(View.GONE);
    fishSaltWater.setVisibility(View.GONE);
    spiderHabitat.setVisibility(View.GONE);
    spiderVenomous.setVisibility(View.GONE);
    insectVenomous.setVisibility(View.GONE);
    insectFlying.setVisibility(View.GONE);
    littleAnAvarageLife.setVisibility(View.GONE);
    amphibiumPoisonous.setVisibility(View.GONE);
    amphibiumVenomous.setVisibility(View.GONE);
    amphibiumSaltWater.setVisibility(View.GONE);
    itemPosition=0;
}
        else if(position==1){
    species.setVisibility(View.GONE);
    fishTemperature.setVisibility(View.VISIBLE);
    fishSaltWater.setVisibility(View.VISIBLE);
    spiderHabitat.setVisibility(View.GONE);
    spiderVenomous.setVisibility(View.GONE);
    insectVenomous.setVisibility(View.GONE);
    insectFlying.setVisibility(View.GONE);
    littleAnAvarageLife.setVisibility(View.GONE);
    amphibiumPoisonous.setVisibility(View.GONE);
    amphibiumVenomous.setVisibility(View.GONE);
    amphibiumSaltWater.setVisibility(View.GONE);
    itemPosition=1;
}
else if(position==2){
    species.setVisibility(View.GONE);
    fishTemperature.setVisibility(View.GONE);
    fishSaltWater.setVisibility(View.GONE);
    spiderHabitat.setVisibility(View.VISIBLE);
    spiderVenomous.setVisibility(View.VISIBLE);
    insectVenomous.setVisibility(View.GONE);
    insectFlying.setVisibility(View.GONE);
    littleAnAvarageLife.setVisibility(View.GONE);
    amphibiumPoisonous.setVisibility(View.GONE);
    amphibiumVenomous.setVisibility(View.GONE);
    amphibiumSaltWater.setVisibility(View.GONE);
    itemPosition=2;
    System.out.println(fishSaltWater.getSplitTrack());

}    else if(position==3){
    species.setVisibility(View.GONE);
    fishTemperature.setVisibility(View.GONE);
    fishSaltWater.setVisibility(View.GONE);
    spiderHabitat.setVisibility(View.GONE);
    spiderVenomous.setVisibility(View.GONE);
    insectVenomous.setVisibility(View.VISIBLE);
    insectFlying.setVisibility(View.VISIBLE);
    littleAnAvarageLife.setVisibility(View.GONE);
    amphibiumPoisonous.setVisibility(View.GONE);
    amphibiumVenomous.setVisibility(View.GONE);
    amphibiumSaltWater.setVisibility(View.GONE);
    itemPosition=3;

}
else if(position==4){
    species.setVisibility(View.GONE);
    fishTemperature.setVisibility(View.GONE);
    fishSaltWater.setVisibility(View.GONE);
    spiderHabitat.setVisibility(View.GONE);
    spiderVenomous.setVisibility(View.GONE);
    insectVenomous.setVisibility(View.GONE);
    insectFlying.setVisibility(View.GONE);
    littleAnAvarageLife.setVisibility(View.VISIBLE);
    amphibiumPoisonous.setVisibility(View.GONE);
    amphibiumVenomous.setVisibility(View.GONE);
    amphibiumSaltWater.setVisibility(View.GONE);
    itemPosition=4;
}
else if(position==5){
    species.setVisibility(View.GONE);
    fishTemperature.setVisibility(View.GONE);
    fishSaltWater.setVisibility(View.GONE);
    spiderHabitat.setVisibility(View.GONE);
    spiderVenomous.setVisibility(View.GONE);
    insectVenomous.setVisibility(View.GONE);
    insectFlying.setVisibility(View.GONE);
    littleAnAvarageLife.setVisibility(View.GONE);
    amphibiumPoisonous.setVisibility(View.VISIBLE);
    amphibiumVenomous.setVisibility(View.VISIBLE);
    amphibiumSaltWater.setVisibility(View.VISIBLE);
    itemPosition=5;

}
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
/*
    public Product addProduct(int index){
if(index!=-1){
    Product product = Factory.getInstance().getProduct(categories.get(index));
if(product instanceof Birds){
    ((Birds) product).setBirdsParameters(species.getText().toString());
}
    else if(product instanceof Fish){

    ((Fish) product).setFishParameters(Integer.parseInt(fishTemperature.getText().toString()),fishSaltWater.getSplitTrack());
    System.out.println(fishSaltWater.getSplitTrack());
}
    else if(product instanceof Spider){
   // ((Spider) product).setSpidersParameters(spiderVenomous.getSplitTrack(););
}
}
    return null;
    }*/
}
