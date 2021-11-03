package by.tc.task01.dao.builder;

import by.tc.task01.entity.Laptop;

public class LaptopBuilder extends Builder{
    private int batteryCapacity;
    private String OS;
    private int memoryROM;
    private int systemMemory;
    private double CPU;
    private int displayInches;
    private String category;

    @Override
    public void setCategory(String category){
        this.category = category;
    }

    @Override
    public Laptop getApp(){
        return new Laptop(category,batteryCapacity,OS,memoryROM,systemMemory,CPU,displayInches);
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

}
