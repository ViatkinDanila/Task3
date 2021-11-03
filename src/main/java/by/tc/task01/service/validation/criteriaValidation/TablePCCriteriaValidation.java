package by.tc.task01.service.validation.criteriaValidation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Set;

public class TablePCCriteriaValidation implements CriteriaValidator{
    @Override
    public boolean paramValidation(Set<String> params){
        for (String param : params) {
            if (!(param.toUpperCase().equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.TabletPC.MEMORY_ROM.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.TabletPC.COLOR.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()))) {
                return false;
            }
        }
        return true;
    };

}
