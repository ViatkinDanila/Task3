package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		// you may add your own code here
		if(appliances.size()!= 0) {
			for (Appliance appliance : appliances) {
				System.out.println(appliance);
			}
		}else{
			System.out.println("There is no appliance like this.");
		}
	}
	
	// you may add your own code here

}
