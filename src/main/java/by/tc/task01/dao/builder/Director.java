package by.tc.task01.dao.builder;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import by.tc.task01.entity.criteria.SearchCriteria.*;

public class Director {

        public void buildLaptop(LaptopBuilder laptopBuilder, Map<String, String> params){
            laptopBuilder.setCPU(Integer.parseInt(params.get(Laptop.CPU.toString())));
            laptopBuilder.setBatteryCapacity(Integer.parseInt(params.get(Laptop.BATTERY_CAPACITY.toString())));
            laptopBuilder.setDisplayInches(Integer.parseInt(params.get(Laptop.DISPLAY_INCHES.toString())));
            laptopBuilder.setOS(params.get(Laptop.OS.toString()));
            laptopBuilder.setSystemMemory(Integer.parseInt(params.get(Laptop.SYSTEM_MEMORY.toString())));
            laptopBuilder.setMemoryROM(Integer.parseInt(params.get(Laptop.MEMORY_ROM.toString())));
            laptopBuilder.setCategory(params.get("CATEGORY"));
        }
        public void buildOven(OvenBuilder ovenBuilder, Map<String, String> params){
            ovenBuilder.setCapacity(Integer.parseInt(params.get(Oven.CAPACITY.toString())));
            ovenBuilder.setDepth(Double.parseDouble(params.get(Oven.DEPTH.toString())));
            ovenBuilder.setHeight(Double.parseDouble(params.get(Oven.HEIGHT.toString())));
            ovenBuilder.setPowerConsumption(Integer.parseInt(params.get(Oven.POWER_CONSUMPTION.toString())));
            ovenBuilder.setWeight(Double.parseDouble(params.get(Oven.WEIGHT.toString())));
            ovenBuilder.setWidth(Double.parseDouble(params.get(Oven.WIDTH.toString())));
            ovenBuilder.setCategory(params.get("CATEGORY"));
        }
        public void buildRefrigerator(RefrigeratorBuilder refrigeratorBuilder, Map<String, String> params){
            refrigeratorBuilder.setHeight(Double.parseDouble(params.get(Refrigerator.HEIGHT.toString())));
            refrigeratorBuilder.setFreezerCapacity(Double.parseDouble(params.get(Refrigerator.FREEZER_CAPACITY.toString())));
            refrigeratorBuilder.setPowerConsumption(Double.parseDouble(params.get(Refrigerator.POWER_CONSUMPTION.toString())));
            refrigeratorBuilder.setWeight(Double.parseDouble(params.get(Refrigerator.WEIGHT.toString())));
            refrigeratorBuilder.setWidth(Double.parseDouble(params.get(Refrigerator.WIDTH.toString())));
            refrigeratorBuilder.setOverallCapacity(Double.parseDouble(params.get(Refrigerator.OVERALL_CAPACITY.toString())));
            refrigeratorBuilder.setCategory(params.get("CATEGORY"));
        }
        public void buildSpeakers(SpeakersBuilder speakersBuilder, Map<String, String> params){
            speakersBuilder.setNumberOfSpeakers(Integer.parseInt(params.get(Speakers.NUMBER_OF_SPEAKERS.toString())));
            speakersBuilder.setCordLength(Double.parseDouble(params.get(Speakers.CORD_LENGTH.toString())));
            speakersBuilder.setPowerConsumption(Double.parseDouble(params.get(Speakers.POWER_CONSUMPTION.toString())));
            speakersBuilder.setFrequencyRange(params.get(Speakers.FREQUENCY_RANGE.toString()));
            speakersBuilder.setCategory(params.get("CATEGORY"));
        }
        public void buildTablePC(TablePCBuilder tablePCBuilder, Map<String, String> params){
            tablePCBuilder.setColor(params.get(TabletPC.COLOR.toString()));
            tablePCBuilder.setBatteryCapacity(Double.parseDouble(params.get(TabletPC.BATTERY_CAPACITY.toString())));
            tablePCBuilder.setMemoryROM(Integer.parseInt(params.get(TabletPC.MEMORY_ROM.toString())));
            tablePCBuilder.setDisplayInches(Double.parseDouble(params.get(TabletPC.DISPLAY_INCHES.toString())));
            tablePCBuilder.setFlashMemoryCapacity(Double.parseDouble(params.get(TabletPC.FLASH_MEMORY_CAPACITY.toString())));
            tablePCBuilder.setCategory(params.get("CATEGORY"));
        }
        public void buildVacuumCleaner(VacuumCleanerBuilder vacuumCleanerBuilder, Map<String, String> params){
            vacuumCleanerBuilder.setCleaningWidth(Double.parseDouble(params.get(VacuumCleaner.CLEANING_WIDTH.toString())));
            vacuumCleanerBuilder.setBagType(params.get(VacuumCleaner.BAG_TYPE.toString()));
            vacuumCleanerBuilder.setFilterType(params.get(VacuumCleaner.FILTER_TYPE.toString()));
            vacuumCleanerBuilder.setMotorSpeedRegulation(Double.parseDouble(params.get(VacuumCleaner.MOTOR_SPEED_REGULATION.toString())));
            vacuumCleanerBuilder.setWandType(params.get(VacuumCleaner.WAND_TYPE.toString()));
            vacuumCleanerBuilder.setPowerConsumption(Double.parseDouble(params.get(VacuumCleaner.POWER_CONSUMPTION.toString())));
            vacuumCleanerBuilder.setCategory(params.get("CATEGORY"));
        }
}
