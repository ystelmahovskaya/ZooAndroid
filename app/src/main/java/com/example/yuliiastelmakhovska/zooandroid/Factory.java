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
            System.out.println("FISH");
            return new Fish();
        }
        else if(type.equalsIgnoreCase("Amphibium")){
            System.out.println("AMPHIBIUM");
            return new Amphibium();

        }
        else if(type.equalsIgnoreCase("Bird")){
            System.out.println("BIRD");
            return new Birds();
        }

        else if(type.equalsIgnoreCase("Little Animal")){
            System.out.println("LITTLE");
            return new LittleAnimals();
        }
        else if(type.equalsIgnoreCase("Spider")){
            System.out.println("SPIDER");
            return new Spider();
        }
        else if(type.equalsIgnoreCase("Insect")){
            System.out.println("INSECT");
            return new Insects();
        }
        else {
            return null;
        }
    }
}
