package by.tc.task01.service.validation.criteriaValidation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Set;

public class RefrigeratorCriteriaValidation implements CriteriaValidator{
    @Override
    public boolean paramValidation(Set<String> params){
        for (String param : params) {
            if (!(param.toUpperCase().equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Refrigerator.WEIGHT.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Refrigerator.HEIGHT.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Refrigerator.WIDTH.toString()))) {
                return false;
            }
        }
        return true;
    }

}