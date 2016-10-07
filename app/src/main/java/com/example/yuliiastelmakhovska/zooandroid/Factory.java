package com.example.yuliiastelmakhovska.zooandroid;

/**
 * Created by yuliiastelmakhovska on 06/10/16.
 */



public class Factory {


    private Factory() {
    }

    public static Factory getInstance() {
        return FactoryHolder.INSTANCE;
    }

    private static class FactoryHolder {

        private static final Factory INSTANCE = new Factory();
    }

    public Product getProduct(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Fish")){

            return new Fish();
        }
        else if(type.equalsIgnoreCase("Amphibium")){

            return new Amphibium();
        }
        else if(type.equalsIgnoreCase("Bird")){

            return new Birds();
        }

        else if(type.equalsIgnoreCase("LittleAnimals")){

            return new LittleAnimals();
        }
        else if(type.equalsIgnoreCase("Spider")){

            return new Spider();
        }
        else if(type.equalsIgnoreCase("Insects")){

            return new Insects();
        }
        else {
            return null;
        }
    }
}
