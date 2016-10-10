package com.example.yuliiastelmakhovska.zooandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ItemView extends AppCompatActivity {
    TextView productName;
    TextView productPrice;
    TextView productAliveAge;
    TextView productAlivePredator;
    TextView species;
    TextView fishTemperature;
    TextView fishSaltWater;
    TextView spiderHabitat ;
    TextView spiderVenomous;
    TextView insectVenomous;
    TextView insectFlying;
    TextView littleAnAvarageLife;
    TextView amphibiumVenomous;
    TextView amphibiumPoisonous;
    TextView amphibiumSaltWater;
    Product startProduct=Main.branches.branches.get(Main.branches.activeBranch).getListOfProducts().get(Main.branches.activeItem);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);
     productName = (TextView)findViewById(R.id.textViewName);
      productPrice = (TextView)findViewById(R.id.textViewPrice);
        productAliveAge  = (TextView)findViewById(R.id.textViewAge);
        productAlivePredator = (TextView)findViewById(R.id.textViewPredator);
        species = (TextView)findViewById(R.id.textViewSpecies);
        fishTemperature = (TextView)findViewById(R.id.textViewFishTemp);
        fishSaltWater = (TextView)findViewById(R.id.textViewFishSalt);
       spiderHabitat  = (TextView)findViewById(R.id.textViewSpidHabit);
        spiderVenomous = (TextView)findViewById(R.id.textviewSpiderv);
        insectVenomous = (TextView)findViewById(R.id.textViewInsectVenomous);
    insectFlying = (TextView)findViewById(R.id.textViewInsectFly);
        littleAnAvarageLife = (TextView)findViewById(R.id.textviewlittleAva);
        amphibiumVenomous= (TextView)findViewById(R.id.textViewAmphVen);
        amphibiumPoisonous = (TextView)findViewById(R.id.textViewAmphPois);
        amphibiumSaltWater = (TextView)findViewById(R.id.textViewAmphSalt);
        if(startProduct instanceof Birds) {
            productName.setVisibility(View.VISIBLE);
            productName.setText("Name: " + startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText("Price: " + startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText("Age: " + ((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setText("Predator: " + ((AliveIndividuals) startProduct).isIsPredator());
            species.setVisibility(View.VISIBLE);
            species.setText("Species" + ((Birds) startProduct).getSpecies());
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
            productName.setText("Name: "+startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText("Price: "+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText("Age: "+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setText("Predator: "+ ((AliveIndividuals) startProduct).isIsPredator());
                species.setVisibility(View.GONE);
                fishTemperature.setVisibility(View.VISIBLE);
                fishTemperature.setText("Temperature: "+ ((Fish) startProduct).getTemperature());
                fishSaltWater.setVisibility(View.VISIBLE);
                fishSaltWater.setText("Live in salt water: "+((Fish) startProduct).isLiveInSaltWater());
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
            productName.setText("Name: "+startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText("Price: "+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText("Age: "+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setText("Predator: "+ ((AliveIndividuals) startProduct).isIsPredator());
                species.setVisibility(View.GONE);
                fishTemperature.setVisibility(View.GONE);
                fishSaltWater.setVisibility(View.GONE);
                spiderHabitat.setVisibility(View.VISIBLE);
                spiderHabitat.setText("Habitat: "+((Spider) startProduct).getHabitat());
                spiderVenomous.setVisibility(View.VISIBLE);
                spiderVenomous.setText("Is venomous: "+((Spider) startProduct).isVenomous());
                insectVenomous.setVisibility(View.GONE);
                insectFlying.setVisibility(View.GONE);
                littleAnAvarageLife.setVisibility(View.GONE);
                amphibiumPoisonous.setVisibility(View.GONE);
                amphibiumVenomous.setVisibility(View.GONE);
                amphibiumSaltWater.setVisibility(View.GONE);
            }
            else if(startProduct instanceof Insects){
            productName.setVisibility(View.VISIBLE);
            productName.setText("Name: "+startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText("Price: "+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText("Age: "+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setText("Predator: "+ ((AliveIndividuals) startProduct).isIsPredator());
                species.setVisibility(View.GONE);
                fishTemperature.setVisibility(View.GONE);
                fishSaltWater.setVisibility(View.GONE);
                spiderHabitat.setVisibility(View.GONE);
                spiderVenomous.setVisibility(View.GONE);
                insectVenomous.setVisibility(View.VISIBLE);
                insectVenomous.setText("Is venomous: "+ ((Insects) startProduct).isVenomous());
                insectFlying.setVisibility(View.VISIBLE);
                insectFlying.setText("Is flying: "+((Insects) startProduct).isFlying());
                littleAnAvarageLife.setVisibility(View.GONE);
                amphibiumPoisonous.setVisibility(View.GONE);
                amphibiumVenomous.setVisibility(View.GONE);
                amphibiumSaltWater.setVisibility(View.GONE);
            }
            else if(startProduct instanceof LittleAnimals){
            productName.setVisibility(View.VISIBLE);
            productName.setText("Name: "+startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText("Price: "+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText("Age: "+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setText("Predator: "+ ((AliveIndividuals) startProduct).isIsPredator());
                species.setVisibility(View.GONE);
                fishTemperature.setVisibility(View.GONE);
                fishSaltWater.setVisibility(View.GONE);
                spiderHabitat.setVisibility(View.GONE);
                spiderVenomous.setVisibility(View.GONE);
                insectVenomous.setVisibility(View.GONE);
                insectFlying.setVisibility(View.GONE);
                littleAnAvarageLife.setVisibility(View.VISIBLE);
                littleAnAvarageLife.setText("Avarage life length: "+((LittleAnimals) startProduct).getAvarageLife());
                amphibiumPoisonous.setVisibility(View.GONE);
                amphibiumVenomous.setVisibility(View.GONE);
                amphibiumSaltWater.setVisibility(View.GONE);
            }
            else if(startProduct instanceof Amphibium){
            productName.setVisibility(View.VISIBLE);
            productName.setText("Name: "+startProduct.getNameOfProduct());
            productPrice.setVisibility(View.VISIBLE);
            productPrice.setText("Price: "+startProduct.getPrice());
            productAliveAge.setVisibility(View.VISIBLE);
            productAliveAge.setText("Age: "+((AliveIndividuals) startProduct).getAge());
            productAlivePredator.setVisibility(View.VISIBLE);
            productAlivePredator.setText("Predator: "+ ((AliveIndividuals) startProduct).isIsPredator());
                species.setVisibility(View.GONE);
                fishTemperature.setVisibility(View.GONE);
                fishSaltWater.setVisibility(View.GONE);
                spiderHabitat.setVisibility(View.GONE);
                spiderVenomous.setVisibility(View.GONE);
                insectVenomous.setVisibility(View.GONE);
                insectFlying.setVisibility(View.GONE);
                littleAnAvarageLife.setVisibility(View.GONE);
                amphibiumPoisonous.setVisibility(View.VISIBLE);
                amphibiumPoisonous.setText("Is poisonous: "+((Amphibium) startProduct).isPoison());
                amphibiumVenomous.setVisibility(View.VISIBLE);
                amphibiumVenomous.setText("Is venomous: "+((Amphibium) startProduct).isVenomous());
                amphibiumSaltWater.setVisibility(View.VISIBLE);
                amphibiumSaltWater.setText("Live in salt water: "+((Amphibium) startProduct).isLiveInSaltWater());
            }
    }
}
