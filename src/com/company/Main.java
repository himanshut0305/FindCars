package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {



    private static List<Car> findCarsWithMoreAverageHP(ArrayList<Car> requiredOriginCars, int no) {
        double sum = 0;
        for(Car c: requiredOriginCars){
                sum = sum+ c.getHorsepower();
        }
        double averageHorsePower = sum/requiredOriginCars.size();
        List<Car> requiredCars = new ArrayList<>();
        for(Car c:requiredOriginCars){
            if(c.getHorsepower() > averageHorsePower){
                requiredCars.add(c);
            }
        }
         requiredCars =  requiredCars.subList(0,no);
        return  requiredCars;
    }

    private static ArrayList<Car> findCarsOfOrigin(String requiredOrigin, ArrayList<Car> allCars) {
        ArrayList<Car> filteredCars = new ArrayList<>();
        for(Car c: allCars){
            if(c.getOrigin().equals(requiredOrigin)){
                filteredCars.add(c);
            }

        }
        return  filteredCars;
    }

    public static class Car {
        String carName;
        String origin;
        double horsepower;

        Car(String carName, String origin, double horsepower){
            this.carName = carName;
            this.origin = origin;
            this.horsepower = horsepower;
        }

        public String getCarName() {
            return carName;
        }

        public void setCarName(String carName) {
            this.carName = carName;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public double getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(double horsepower) {
            this.horsepower = horsepower;
        }

        @Override
        public String toString() {
            return "Cars{" +
                    "carName='" + carName + '\'' +
                    ", origin='" + origin + '\'' +
                    ", horsepower=" + horsepower +
                    '}';
        }
    }
}

