package by.tc.task01.service.validation.criteriaValidation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Set;

public class LaptopCriteriaValidation implements CriteriaValidator{

    public boolean compare(double value, double min, double max){
        return value >= min && value <= max;
    }
    @Override
    public boolean paramValidation(Set<String> params){
        for (String param : params) {
            if (!(param.toUpperCase().equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Laptop.OS.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Laptop.MEMORY_ROM.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Laptop.CPU.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Laptop.DISPLAY_INCHES.toString()))) {
                return false;
            }
        }
        return true;
    };

}
