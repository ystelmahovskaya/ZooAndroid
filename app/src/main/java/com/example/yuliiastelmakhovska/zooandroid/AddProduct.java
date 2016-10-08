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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddProduct extends AppCompatActivity implements OnItemSelectedListener {

    EditText productName;
    EditText productPrice;
    EditText productAliveAge;
    Switch productAlivePredator;
    EditText species;
    EditText fishTemperature;
    Switch fishSaltWater;
    EditText spiderHabitat ;
    Switch spiderVenomous;
    Switch insectVenomous;
    Switch insectFlying;
    EditText littleAnAvarageLife;
    Switch amphibiumVenomous;
    Switch amphibiumPoisonous;
    Switch amphibiumSaltWater;

    int itemPosition=-1;
    List<String> categories = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerProducts);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
        categories.add("Choose type");
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
        productName=(EditText)findViewById(R.id.editTextName);
        productPrice=(EditText)findViewById(R.id.editTextPrice);
        productAliveAge=(EditText)findViewById(R.id.editTextAliveAge);
        productAlivePredator=(Switch)findViewById(R.id.switchPredator);
        species = (EditText) findViewById(R.id.editTextSpecies);
        fishTemperature = (EditText) findViewById(R.id.editTextFishTemp);
       fishSaltWater= (Switch)findViewById(R.id.switchFishSaltWater);
  spiderHabitat = (EditText) findViewById(R.id.editTextSpiderHabitat);
      spiderVenomous= (Switch)findViewById(R.id.switchSpiderVenomous);
         insectVenomous= (Switch)findViewById(R.id.switchInsectVenomous);
         insectFlying= (Switch)findViewById(R.id.switchInsectFlying);
         littleAnAvarageLife = (EditText) findViewById(R.id.editTextLittAnimLife);
         amphibiumVenomous= (Switch)findViewById(R.id.switchAmphibiumVenomous);
         amphibiumPoisonous= (Switch)findViewById(R.id.switchAmphibiumPoisonous);
         amphibiumSaltWater= (Switch)findViewById(R.id.switchAmphibiumSaltWater);


        if(position==0){
            productName.setVisibility(View.GONE);
           productPrice.setVisibility(View.GONE);
            productAliveAge.setVisibility(View.GONE);
            productAlivePredator.setVisibility(View.GONE);
            species.setVisibility(View.GONE);
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

        }
else if(position==1) {
            productName.setVisibility(View.VISIBLE);
            productPrice.setVisibility(View.VISIBLE);
            productAliveAge.setVisibility(View.VISIBLE);
            productAlivePredator.setVisibility(View.VISIBLE);
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
        else if(position==2){
            productName.setVisibility(View.VISIBLE);
            productPrice.setVisibility(View.VISIBLE);
            productAliveAge.setVisibility(View.VISIBLE);
            productAlivePredator.setVisibility(View.VISIBLE);
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
else if(position==3){
            productName.setVisibility(View.VISIBLE);
            productPrice.setVisibility(View.VISIBLE);
            productAliveAge.setVisibility(View.VISIBLE);
            productAlivePredator.setVisibility(View.VISIBLE);
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


}    else if(position==4){
            productName.setVisibility(View.VISIBLE);
            productPrice.setVisibility(View.VISIBLE);
            productAliveAge.setVisibility(View.VISIBLE);
            productAlivePredator.setVisibility(View.VISIBLE);
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
else if(position==5){
            productName.setVisibility(View.VISIBLE);
            productPrice.setVisibility(View.VISIBLE);
            productAliveAge.setVisibility(View.VISIBLE);
            productAlivePredator.setVisibility(View.VISIBLE);
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
else if(position==6){
            productName.setVisibility(View.VISIBLE);
            productPrice.setVisibility(View.VISIBLE);
            productAliveAge.setVisibility(View.VISIBLE);
            productAlivePredator.setVisibility(View.VISIBLE);
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

    public Product addProduct(int index){
if(index!=-1){
    Product product = Factory.getInstance().getProduct(categories.get(index));
    product.setNameOfProduct(productName.getText().toString());
    product.setPrice(Double.parseDouble(productPrice.getText().toString()));

    if(product instanceof AliveIndividuals){
        ((AliveIndividuals) product).setAliveIndividualsParameters(Integer.parseInt(productAliveAge.getText().toString()),productAlivePredator.isChecked());
    }
if(product instanceof Birds){
    ((Birds) product).setBirdsParameters(species.getText().toString());
}
    else if(product instanceof Fish){

    ((Fish) product).setFishParameters(Integer.parseInt(fishTemperature.getText().toString()),fishSaltWater.isChecked());
    System.out.println(fishSaltWater.getSplitTrack());
}
    else if(product instanceof Spider){
   ((Spider) product).setSpidersParameters(spiderVenomous.isChecked(),spiderHabitat.getText().toString());
}
    else if(product instanceof Insects){
    ((Insects) product).setInsectsparameters(insectVenomous.isChecked(),insectFlying.isChecked());

}
    else if(product instanceof LittleAnimals){
    ((LittleAnimals) product).setAvarageLife(Integer.parseInt(littleAnAvarageLife.getText().toString()));
}else if(product instanceof Amphibium){
    ((Amphibium) product).setAmphibiumParameters(amphibiumVenomous.isChecked(),amphibiumPoisonous.isChecked(),amphibiumSaltWater.isChecked());
}
}
    return null;
    }

    public void saveProduct(View v) throws IOException {
       // try {


            Main.branches.branches.get(Main.branches.activeBranch).getListOfProducts().add(addProduct(itemPosition));
            Main.branches.printToFile(this, Main.branches.branches.get(Main.branches.activeBranch));
       // }
    //catch (Exception e){
      //  AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        //dlgAlert.setMessage("Wrong data");
        //dlgAlert.setTitle("Fail");
        //dlgAlert.setPositiveButton("OK", null);
        //dlgAlert.setCancelable(true);
        //dlgAlert.create().show();
    //}
    }
}
