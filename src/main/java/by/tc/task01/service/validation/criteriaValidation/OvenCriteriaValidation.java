package by.tc.task01.service.validation.criteriaValidation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Set;

public class OvenCriteriaValidation implements CriteriaValidator {

    public boolean compare(double value, double min, double max){
        return value >= min && value <= max;
    }
    @Override
    public boolean paramValidation(Set<String> params) {
        for(String param : params){
            if (!(param.toUpperCase().equals(SearchCriteria.Oven.POWER_CONSUMPTION.toString())||
                    param.toUpperCase().equals(SearchCriteria.Oven.WEIGHT.toString())||
                    param.toUpperCase().equals(SearchCriteria.Oven.CAPACITY.toString())||
                    param.toUpperCase().equals(SearchCriteria.Oven.DEPTH.toString())||
                    param.toUpperCase().equals(SearchCriteria.Oven.HEIGHT.toString())||
                    param.toUpperCase().equals(SearchCriteria.Oven.WIDTH.toString()))){
                return false;
            }
        }
        return true;
    }

}
