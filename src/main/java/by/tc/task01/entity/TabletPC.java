package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TabletPC extends Appliance{
	// you may add your own code here
    private double batteryCapacity;
    private double displayInches;
    private int memoryROM;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(String category, String color, double flashMemoryCapacity, double batteryCapacity, int memoryROM, double displayInches) {
        super(category);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public double getDisplayInches() {
        return displayInches;
    }
    @Override
    public Map<String, String> getParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put(SearchCriteria.TabletPC.COLOR.toString().toLowerCase(), color);
        params.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString().toLowerCase(), String.valueOf(flashMemoryCapacity));
        params.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString().toLowerCase(), String.valueOf(batteryCapacity));
        params.put(SearchCriteria.TabletPC.MEMORY_ROM.toString().toLowerCase(), String.valueOf(memoryROM));
        params.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString().toLowerCase(), String.valueOf(displayInches));
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

        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0
                && Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
                && memoryROM == tabletPC.memoryROM
                && Double.compare(tabletPC.displayInches, displayInches) == 0
                && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, flashMemoryCapacity, batteryCapacity, memoryROM, displayInches);
    }

    @Override
    public String toString() {
        return "TabletPC{" + "category=" + getCategory() +
                "color='" + color + '\'' +
                "; flashMemoryCapacity=" + flashMemoryCapacity +
                "; batteryCapacity=" + batteryCapacity +
                "; memoryROM=" + memoryROM +
                "; displayInches=" + displayInches +
                '}';
    }

}
