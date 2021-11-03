package by.tc.task01.dao.impl;

import by.tc.task01.dao.builder.*;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.dao.parser.exception.ParserException;
import by.tc.task01.dao.parser.impl.SaxApplianceParser;
import by.tc.task01.dao.writer.exception.DOMException;
import by.tc.task01.dao.writer.impl.DomApplianceWriter;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO{

	private final File db = new File(Objects.requireNonNull(getClass().getClassLoader().getResource("appliances.xml").getFile()));

	public boolean isMatch(Map<String, Object> searchParams, Map<String,String> appliance){
		return searchParams.keySet().stream().allMatch(parameter -> searchParams.get(parameter).toString().equals(appliance.get(parameter)));
	}


	public Appliance getAppliance(Map<String,String> appliance){
		Director director = new Director();
		Builder builder = new Builder();
		switch (appliance.get("CATEGORY").toUpperCase()){
			case ("LAPTOP"):
				builder = new LaptopBuilder();
				director.buildLaptop((LaptopBuilder)builder,appliance);
				break;
			case ("OVEN"):
				builder = new OvenBuilder();
				director.buildOven((OvenBuilder)builder,appliance);
				break;
			case ("REFRIGERATOR"):
				builder = new RefrigeratorBuilder();
				director.buildRefrigerator((RefrigeratorBuilder)builder,appliance);
				break;
			case ("SPEAKERS"):
				builder = new SpeakersBuilder();
				director.buildSpeakers((SpeakersBuilder)builder,appliance);
				break;
			case ("TABLEPC"):
				builder = new TablePCBuilder();
				director.buildTablePC((TablePCBuilder)builder,appliance);
				break;
			case ("VACUUMCLEANER"):
				builder = new VacuumCleanerBuilder();
				director.buildVacuumCleaner((VacuumCleanerBuilder)builder,appliance);
				break;
		}
		return builder.getApp();
	}

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {
		// you may add your own code here
		//реализовать поиск из файл txt по оперделенному критерию именно здесь
		List<Appliance> appliances = new ArrayList<>();
		try {
			SaxApplianceParser parser = new SaxApplianceParser();
			List<Map<String,String>> params = parser.parse(db);

			for (Map<String, String> oneApplianceParams: params){
					if (isMatch(criteria.getCriteria(), oneApplianceParams)) {
						if (!criteria.getCriteria().isEmpty()) {
							if (criteria.getGroupSearchName().toLowerCase().equals(oneApplianceParams.get("CATEGORY"))) {
								appliances.add(getAppliance(oneApplianceParams));
							}
						}else {
							appliances.add(getAppliance(oneApplianceParams));
						}
					}
			}
		}catch(IOException| ParserException | ParserConfigurationException | org.xml.sax.SAXException e){
			throw new DAOException(e);
		}

		return appliances;
	}

	@Override
	public void add(Appliance appliance) throws DAOException{
		try{
			DomApplianceWriter domApplianceWriter = new DomApplianceWriter();
			domApplianceWriter.add(appliance, db);
		}catch (DOMException| SAXException |IOException | ParserConfigurationException | TransformerException e){
			throw new DAOException(e);
		}
	}
	


}
