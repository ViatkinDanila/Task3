package by.tc.task01.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Appliance implements Serializable{
    private String category;

    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public Appliance(){}
    public Appliance(String category){
        this.category = category;
    }

    public Map<String, String> getParams(){
        Map<String,String> params = new HashMap<String,String>();
        params.put("CATEGORY",category);
        return params;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Appliance appliance = (Appliance) o;
        return appliance.category.equals(this.category);
    }
    @Override
    public int hashCode(){
        return Objects.hash(category);
    }
    @Override
    public String toString(){
        return "Appliance{" + "category = " + category + "}";
    }
}
