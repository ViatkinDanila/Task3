package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.service.exception.ServiceException;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		List<Appliance> appliances;
		try {
			DAOFactory factory = DAOFactory.getInstance();
			ApplianceDAO applianceDAO = factory.getApplianceDAO();

			appliances = applianceDAO.find(criteria);
		}catch(DAOException e){
			throw new ServiceException("Method find",e);
		}
		return appliances;
	}
	@Override
	public void add(Appliance appliance) throws ServiceException{
		try{
			DAOFactory factory = DAOFactory.getInstance();
			ApplianceDAO applianceDAO = factory.getApplianceDAO();
			applianceDAO.add(appliance);
		}catch(DAOException e){
			throw new ServiceException("Method add",e);
		}
	}
}


