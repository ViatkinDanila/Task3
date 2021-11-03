package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {
	// имя товара
	private String groupSearchName = "";
	//Используются для добавления опеределенного товара, 1 пар. характеристика 2 пар. ее значение
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(){};

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() { return groupSearchName; }

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<String, Object> getCriteria(){
		return criteria;
	}

	public Set<String> getKey(){
		return criteria.keySet();
	}


	
	// you may add your own code here

}
