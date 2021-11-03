package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Speakers extends Appliance{
	// you may add your own code here
    private double powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers() {
    }

    public Speakers(String category, double powerConsumption, int numberOfSpeakers, String frequencyRange, double cordLength) {
        super(category);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    @Override
    public Map<String, String> getParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString().toLowerCase(), String.valueOf(powerConsumption));
        params.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString().toLowerCase(), String.valueOf(numberOfSpeakers));
        params.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString().toLowerCase(), frequencyRange);
        params.put(SearchCriteria.Speakers.CORD_LENGTH.toString().toLowerCase(), String.valueOf(cordLength));
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

        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0
                && numberOfSpeakers == speakers.numberOfSpeakers
                && Double.compare(speakers.cordLength, cordLength) == 0
                && Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" + "category=" + getCategory() +
                "; powerConsumption=" + powerConsumption +
                "; numberOfSpeakers=" + numberOfSpeakers +
                "; frequencyRange='" + frequencyRange +
                "; cordLength=" + cordLength +
                '}';
    }
}
