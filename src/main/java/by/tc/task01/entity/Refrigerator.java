package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance{
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {
    }

    public Refrigerator(String category, double powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
        super(category);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public Map<String, String> getParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString().toLowerCase(), String.valueOf(powerConsumption));
        params.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString().toLowerCase(), String.valueOf(freezerCapacity));
        params.put(SearchCriteria.Oven.WEIGHT.toString().toLowerCase(), String.valueOf(weight));
        params.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString().toLowerCase(), String.valueOf(overallCapacity));
        params.put(SearchCriteria.Oven.HEIGHT.toString().toLowerCase(), String.valueOf(height));
        params.put(SearchCriteria.Oven.WIDTH.toString().toLowerCase(), String.valueOf(width));
        return params;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0
                && Double.compare(that.weight, weight) == 0
                && Double.compare(that.freezerCapacity, freezerCapacity) == 0
                && Double.compare(that.overallCapacity, overallCapacity) == 0
                && Double.compare(that.height, height) == 0
                && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" + "category=" + getCategory() +
                "; powerConsumption=" + powerConsumption +
                "; weight=" + weight +
                "; freezerCapacity=" + freezerCapacity +
                "; overallCapacity=" + overallCapacity +
                "; height=" + height +
                "; width=" + width +
                '}';
    }
}
