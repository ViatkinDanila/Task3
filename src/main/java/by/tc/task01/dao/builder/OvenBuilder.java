package by.tc.task01.dao.builder;

import by.tc.task01.entity.Oven;

public class OvenBuilder extends Builder{
    private String category;
    private int powerConsumption;
    private int capacity;
    private double weight;
    private double depth;
    private double height;
    private double width;

    @Override
    public void setCategory(String category){
        this.category = category;
    }

    @Override
    public Oven getApp(){
        return new Oven(category,powerConsumption,capacity,weight,depth,height,width);
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }


}
