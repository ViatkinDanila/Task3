package by.tc.task01.service.validation.criteriaValidation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Set;

public class VacuumCleanerCriteriaValidation implements CriteriaValidator{
    @Override
    public boolean paramValidation(Set<String> params){
        for (String param : params) {
        if (!(param.toUpperCase().equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()) ||
                param.toUpperCase().equals(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()) ||
                param.toUpperCase().equals(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()) ||
                param.toUpperCase().equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()) ||
                param.toUpperCase().equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()))) {
            return false;
        }
    }
    return true;
    }
}
