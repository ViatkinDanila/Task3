package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class Laptop extends Appliance{
	// you may add your own code here
    private double batteryCapacity;
    private String OS;
    private int memoryROM;
    private int systemMemory;
    private double CPU;
    private double displayInches;

    public Laptop() {
    }

    public Laptop(String category, double batteryCapacity, String OS,int memoryROM, int systemMemory, double CPU,  double displayInches) {
        super(category);
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInches = displayInches;
    }

    public String getOS() {
        return OS;
    }

    public double getCPU() {
        return CPU;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    @Override
    public Map<String, String> getParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put(SearchCriteria.Laptop.CPU.toString().toLowerCase(), String.valueOf(CPU));
        params.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString().toLowerCase(), String.valueOf(batteryCapacity));
        params.put(SearchCriteria.Laptop.OS.toString().toLowerCase(), OS);
        params.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString().toLowerCase(), String.valueOf(systemMemory));
        params.put(SearchCriteria.Laptop.MEMORY_ROM.toString().toLowerCase(), String.valueOf(memoryROM));
        params.put(SearchCriteria.Laptop.DISPLAY_INCHES.toString().toLowerCase(), String.valueOf(displayInches));
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

        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                Objects.equals(OS, laptop.OS) &&
                memoryROM == laptop.memoryROM &&
                systemMemory == laptop.systemMemory &&
                Double.compare(laptop.CPU, CPU) == 0 &&
                Double.compare(laptop.displayInches, displayInches) == 0 ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),batteryCapacity, OS, memoryROM, systemMemory, CPU, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "category=" + getCategory() +
                "; batteryCapacity=" + batteryCapacity +
                "; OS='" + OS + '\'' +
                "; memoryROM=" + memoryROM +
                "; systemMemory=" + systemMemory +
                "; CPU=" + CPU +
                "; displayInches=" + displayInches +
                '}';
    }

}
