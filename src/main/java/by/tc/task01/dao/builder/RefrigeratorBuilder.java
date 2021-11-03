package by.tc.task01.dao.builder;

import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder extends Builder{
        private double powerConsumption;
        private double weight;
        private double freezerCapacity;
        private double overallCapacity;
        private double height;
        private double width;
        private String category;

        @Override
        public void setCategory(String category){
            this.category = category;
        }

        @Override
        public Refrigerator getApp(){
            return new Refrigerator(category, powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
        }

        public void setPowerConsumption(double powerConsumption) {
             this.powerConsumption = powerConsumption;
        }

        public void setWeight(double weight) {
             this.weight = weight;
        }

        public void setFreezerCapacity(double freezerCapacity) {
             this.freezerCapacity = freezerCapacity;
        }

        public void setOverallCapacity(double overallCapacity) {
             this.overallCapacity = overallCapacity;
         }

        public void setHeight(double height) {
              this.height = height;
        }

        public void setWidth(double width) {
            this.width = width;
        }

}
