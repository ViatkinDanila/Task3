package by.tc.task01.dao.builder;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder extends Builder{
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;
    private String category;

    @Override
    public void setCategory(String category){
        this.category = category;
    }

    @Override
    public VacuumCleaner getApp(){
        return new VacuumCleaner(category, powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
