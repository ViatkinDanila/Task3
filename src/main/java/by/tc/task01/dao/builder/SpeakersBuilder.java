package by.tc.task01.dao.builder;

import by.tc.task01.entity.Speakers;

public class SpeakersBuilder extends Builder{
    private double powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;
    private String category;

    @Override
    public void setCategory(String category){
        this.category = category;
    }

    @Override
    public Speakers getApp(){
        return new Speakers(category, powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

}
