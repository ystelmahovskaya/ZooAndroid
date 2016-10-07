package com.example.yuliiastelmakhovska.zooandroid;

/**
 * Created by yuliiastelmakhovska on 06/10/16.
 */





public class LittleAnimals extends AliveIndividuals {
    private int avarageLife;



    public int getAvarageLife() {
        return avarageLife;
    }


    public void setAvarageLife(int avarageLife) {
        this.avarageLife = avarageLife;
    }
    public String toString(){
        return new String("LittleAnimal"+"|"+super.toString()+"|"+avarageLife);
    }

}
