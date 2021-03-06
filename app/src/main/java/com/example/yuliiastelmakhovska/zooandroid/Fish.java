package com.example.yuliiastelmakhovska.zooandroid;

/**
 * Created by yuliiastelmakhovska on 06/10/16.
 */




public class Fish extends AliveIndividuals{

    protected int temperature;
    protected boolean liveInSaltWater;




    public int getTemperature() {
        return temperature;
    }

    public boolean isLiveInSaltWater() {
        return liveInSaltWater;
    }


    public void setFishParameters(int temperature,boolean liveInSaltWater) {
        this.setTemperature(temperature);
        this.setLiveInSaltWater(liveInSaltWater);
    }

    public String toString(){
        return new String("Fish"+"|"+super.toString()+"|"+temperature+"|"+liveInSaltWater);
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * @param liveInSaltWater the liveInSaltWater to set
     */
    public void setLiveInSaltWater(boolean liveInSaltWater) {
        this.liveInSaltWater = liveInSaltWater;
    }


}
