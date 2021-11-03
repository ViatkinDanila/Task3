package by.tc.task01.service.validation.criteriaValidation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Set;

public class SpeakersCriteriaValidation implements CriteriaValidator{
    @Override
    public boolean paramValidation(Set<String> params){
        for (String param : params) {
            if (!(param.toUpperCase().equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()) ||
                    param.toUpperCase().equals(SearchCriteria.Speakers.CORD_LENGTH.toString()))) {
                return false;
            }
        }
        return true;
    };

}
