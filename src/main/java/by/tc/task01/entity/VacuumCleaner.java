package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VacuumCleaner extends Appliance{
	// you may add your own code here
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {

    }

    public VacuumCleaner(String category, double powerConsumption, String filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(category);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }
    @Override
    public Map<String, String> getParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString().toLowerCase(), String.valueOf(powerConsumption));
        params.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString().toLowerCase(), String.valueOf(motorSpeedRegulation));
        params.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString().toLowerCase(), String.valueOf(cleaningWidth));
        params.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString().toLowerCase(), bagType);
        params.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString().toLowerCase(), wandType);
        params.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString().toLowerCase(), filterType);
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

        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0
                && Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0
                && Double.compare(that.cleaningWidth, cleaningWidth) == 0
                && Objects.equals(filterType, that.filterType)
                && Objects.equals(bagType, that.bagType)
                && Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        final StringBuilder vcSB = new StringBuilder("VacuumCleaner{");
        vcSB.append("category=").append(this.getCategory());
        vcSB.append("; powerConsumption=").append(powerConsumption);
        vcSB.append("; filterType='").append(filterType).append('\n');
        vcSB.append("; bagType='").append(bagType).append('\n');
        vcSB.append("; wandType='").append(wandType).append('\n');
        vcSB.append("; motorSpeedRegulation=").append(motorSpeedRegulation);
        vcSB.append("; cleaningWidth=").append(cleaningWidth);
        vcSB.append('}');
        return vcSB.toString();
    }
}
