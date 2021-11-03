package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;
import by.tc.task01.service.validation.criteriaValidation.CriteriaValidator;
import by.tc.task01.service.validation.criteriaValidation.*;

import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Validator {

	public static boolean checkGroupSearchName(String groupSearchName){
		if (	groupSearchName.equals("Oven")||
				groupSearchName.equals("Laptop")||
				groupSearchName.equals("Refrigerator")||
				groupSearchName.equals("VacuumCleaner")||
				groupSearchName.equals("TabletPC")||
				groupSearchName.equals("Speakers")){
			return true;
		}
		return false;
	}
	public static boolean checkCriteria(Criteria criteria){
		if(!checkGroupSearchName(criteria.getGroupSearchName())){
			return false;
		}
		CriteriaValidator validator;
		switch(criteria.getGroupSearchName().toUpperCase()){
			case ("OVEN"):
				validator = new OvenCriteriaValidation();
				return validator.paramValidation(criteria.getKey());
			case ("LAPTOP"):
				validator = new LaptopCriteriaValidation();
				return  validator.paramValidation(criteria.getKey()) ;
			case ("REFRIGERATOR"):
				validator = new RefrigeratorCriteriaValidation();
				return  validator.paramValidation(criteria.getKey());
			case ("VACUUMCLEANER"):
				validator = new VacuumCleanerCriteriaValidation();
				return  validator.paramValidation(criteria.getKey());
			case ("TABLEPC"):
				validator = new TablePCCriteriaValidation();
				return  validator.paramValidation(criteria.getKey());
			case ("SPEAKERS"):
				validator = new SpeakersCriteriaValidation();
				return  validator.paramValidation(criteria.getKey());
		}
		return true;
	}

	public static boolean criteriaValidator(Criteria criteria) {
		return checkCriteria(criteria);
	}

}

//you may add your own new classes