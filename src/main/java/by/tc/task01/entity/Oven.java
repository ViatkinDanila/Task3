package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Oven extends Appliance{
	// you may add your own code here
    private int powerConsumption;
    private int capacity;
    private double weight;
    private double depth;
    private double height;
    private double width;

    public Oven(){}

    public Oven(String category, int powerConsumption, int capacity, double weight, double depth, double height, double width){
        super(category);
        this.capacity = capacity;
        this.powerConsumption = powerConsumption;
        this.depth = depth;
        this.height = height;
        this.weight = weight;
        this.width = width;
    }
    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Map<String, String> getParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString().toLowerCase(), String.valueOf(powerConsumption));
        params.put(SearchCriteria.Oven.CAPACITY.toString().toLowerCase(), String.valueOf(capacity));
        params.put(SearchCriteria.Oven.WEIGHT.toString().toLowerCase(), String.valueOf(weight));
        params.put(SearchCriteria.Oven.DEPTH.toString().toLowerCase(), String.valueOf(depth));
        params.put(SearchCriteria.Oven.HEIGHT.toString().toLowerCase(), String.valueOf(height));
        params.put(SearchCriteria.Oven.WIDTH.toString().toLowerCase(), String.valueOf(width));
        return params;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Oven oven = (Oven) o;
        return  Integer.compare(this.powerConsumption,oven.getPowerConsumption()) == 0 &&
                Integer.compare(this.capacity,oven.getCapacity()) == 0&&
                Double.compare(this.weight,oven.getWeight()) == 0&&
                Double.compare(this.depth,oven.getDepth()) == 0&&
                Double.compare(this.height,oven.getHeight()) == 0&&
                Double.compare(this.width,oven.getWidth()) == 0;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.getCategory(),powerConsumption,capacity,weight,depth,height,width);
    }

    @Override
    public String toString(){
        return "Oven{" +
                "category = " + super.getCategory() +
                "; powerConsumption=" + powerConsumption +
                "; weight=" + weight +
                "; capacity=" + capacity +
                "; depth=" + depth +
                "; height=" + height +
                "; width=" + width +
                '}';
    }
}
