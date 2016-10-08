package com.example.yuliiastelmakhovska.zooandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import java.io.IOException;

/**
 * Created by yuliiastelmakhovska on 08/10/16.
 */

public class Edit_Product extends AppCompatActivity {
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
    Product startProduct=Main.branches.branches.get(Main.branches.activeBranch).getListOfProducts().get(Main.branches.activeItem);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_product);
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

        if(startProduct instanceof Birds){
            productName.setVisibility(View.VISIBLE);
            productName.setText(startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText(""+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText(""+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setChecked(((AliveIndividuals) startProduct).isIsPredator());
            species.setVisibility(View.VISIBLE);
            species.setText(((Birds) startProduct).getSpecies());
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
        else if(startProduct instanceof Fish){
            productName.setVisibility(View.VISIBLE);
            productName.setText(startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText(""+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText(""+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setChecked(((AliveIndividuals) startProduct).isIsPredator());
            species.setVisibility(View.GONE);
            fishTemperature.setVisibility(View.VISIBLE);
            fishTemperature.setText(((Fish) startProduct).getTemperature());
            fishSaltWater.setVisibility(View.VISIBLE);
            fishSaltWater.setChecked(((Fish) startProduct).isLiveInSaltWater());
            spiderHabitat.setVisibility(View.GONE);
            spiderVenomous.setVisibility(View.GONE);
            insectVenomous.setVisibility(View.GONE);
            insectFlying.setVisibility(View.GONE);
            littleAnAvarageLife.setVisibility(View.GONE);
            amphibiumPoisonous.setVisibility(View.GONE);
            amphibiumVenomous.setVisibility(View.GONE);
            amphibiumSaltWater.setVisibility(View.GONE);
        }
        else if(startProduct instanceof Spider ){
            productName.setVisibility(View.VISIBLE);
            productName.setText(startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText(""+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText(""+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setChecked(((AliveIndividuals) startProduct).isIsPredator());
            species.setVisibility(View.GONE);
            fishTemperature.setVisibility(View.GONE);
            fishSaltWater.setVisibility(View.GONE);
            spiderHabitat.setVisibility(View.VISIBLE);
            spiderHabitat.setText(((Spider) startProduct).getHabitat());
            spiderVenomous.setVisibility(View.VISIBLE);
            spiderVenomous.setChecked(((Spider) startProduct).isVenomous());
            insectVenomous.setVisibility(View.GONE);
            insectFlying.setVisibility(View.GONE);
            littleAnAvarageLife.setVisibility(View.GONE);
            amphibiumPoisonous.setVisibility(View.GONE);
            amphibiumVenomous.setVisibility(View.GONE);
            amphibiumSaltWater.setVisibility(View.GONE);
        }
        else if(startProduct instanceof Insects){
            productName.setVisibility(View.VISIBLE);
            productName.setText(startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText(""+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText(""+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setChecked(((AliveIndividuals) startProduct).isIsPredator());
            species.setVisibility(View.GONE);
            fishTemperature.setVisibility(View.GONE);
            fishSaltWater.setVisibility(View.GONE);
            spiderHabitat.setVisibility(View.GONE);
            spiderVenomous.setVisibility(View.GONE);
            insectVenomous.setVisibility(View.VISIBLE);
            insectVenomous.setChecked(((Insects) startProduct).isVenomous());
            insectFlying.setVisibility(View.VISIBLE);
            insectFlying.setChecked(((Insects) startProduct).isFlying());
            littleAnAvarageLife.setVisibility(View.GONE);
            amphibiumPoisonous.setVisibility(View.GONE);
            amphibiumVenomous.setVisibility(View.GONE);
            amphibiumSaltWater.setVisibility(View.GONE);
        }
        else if(startProduct instanceof LittleAnimals){
            productName.setVisibility(View.VISIBLE);
            productName.setText(startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText(""+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText(""+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setChecked(((AliveIndividuals) startProduct).isIsPredator());
            species.setVisibility(View.GONE);
            fishTemperature.setVisibility(View.GONE);
            fishSaltWater.setVisibility(View.GONE);
            spiderHabitat.setVisibility(View.GONE);
            spiderVenomous.setVisibility(View.GONE);
            insectVenomous.setVisibility(View.GONE);
            insectFlying.setVisibility(View.GONE);
            littleAnAvarageLife.setVisibility(View.VISIBLE);
            littleAnAvarageLife.setText(((LittleAnimals) startProduct).getAvarageLife());
            amphibiumPoisonous.setVisibility(View.GONE);
            amphibiumVenomous.setVisibility(View.GONE);
            amphibiumSaltWater.setVisibility(View.GONE);
        }
        else if(startProduct instanceof Amphibium){
            productName.setVisibility(View.VISIBLE);
            productName.setText(startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText(""+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText(""+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setChecked(((AliveIndividuals) startProduct).isIsPredator());
            species.setVisibility(View.GONE);
            fishTemperature.setVisibility(View.GONE);
            fishSaltWater.setVisibility(View.GONE);
            spiderHabitat.setVisibility(View.GONE);
            spiderVenomous.setVisibility(View.GONE);
            insectVenomous.setVisibility(View.GONE);
            insectFlying.setVisibility(View.GONE);
            littleAnAvarageLife.setVisibility(View.GONE);
            amphibiumPoisonous.setVisibility(View.VISIBLE);
            amphibiumPoisonous.setChecked(((Amphibium) startProduct).isPoison());
            amphibiumVenomous.setVisibility(View.VISIBLE);
            amphibiumVenomous.setChecked(((Amphibium) startProduct).isVenomous());
            amphibiumSaltWater.setVisibility(View.VISIBLE);
            amphibiumSaltWater.setChecked(((Amphibium) startProduct).isLiveInSaltWater());
        }
    }

    public void editProduct(View v) throws IOException {
        startProduct.setNameOfProduct(productName.getText().toString());
        startProduct.setPrice(Double.parseDouble(productPrice.getText().toString()));

        if(startProduct instanceof AliveIndividuals) {
            ((AliveIndividuals) startProduct).setAliveIndividualsParameters(Integer.parseInt(productAliveAge.getText().toString()), productAlivePredator.isChecked());

            if (startProduct instanceof Birds) {
                ((Birds) startProduct).setBirdsParameters(species.getText().toString());
            } else if (startProduct instanceof Fish) {

                ((Fish) startProduct).setFishParameters(Integer.parseInt(fishTemperature.getText().toString()), fishSaltWater.isChecked());

            } else if (startProduct instanceof Spider) {
                ((Spider) startProduct).setSpidersParameters(spiderVenomous.isChecked(), spiderHabitat.getText().toString());
            } else if (startProduct instanceof Insects) {
                ((Insects) startProduct).setInsectsparameters(insectVenomous.isChecked(), insectFlying.isChecked());

            } else if (startProduct instanceof LittleAnimals) {
                ((LittleAnimals) startProduct).setAvarageLife(Integer.parseInt(littleAnAvarageLife.getText().toString()));
            } else if (startProduct instanceof Amphibium) {
                ((Amphibium) startProduct).setAmphibiumParameters(amphibiumVenomous.isChecked(), amphibiumPoisonous.isChecked(), amphibiumSaltWater.isChecked());

            }
        }
        Main.branches.printToFile(this, Main.branches.branches.get(Main.branches.activeBranch));
        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_OK, returnIntent);
        this.finish();

    }
}
