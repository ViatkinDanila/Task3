package by.tc.task01.dao.builder;

import by.tc.task01.entity.TabletPC;

public class TablePCBuilder extends Builder{
    private double batteryCapacity;
    private double displayInches;
    private int memoryROM;
    private double flashMemoryCapacity;
    private String color;
    private String category;

    @Override
    public void setCategory(String category){
        this.category = category;
    }

    @Override
    public TabletPC getApp(){
        return new TabletPC(category, color, flashMemoryCapacity, batteryCapacity, memoryROM, displayInches);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }
}
