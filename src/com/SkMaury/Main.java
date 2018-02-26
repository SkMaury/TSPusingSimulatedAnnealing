package com.SkMaury;

public class Main {
    public static void main(String args[]){
        for(int i = 0; i < 10000; ++i){
            City city = new City();
            Repository.addCity(city);
        }

        SimulatedAnnealing simulatedAnnealing = new SimulatedAnnealing();
        simulatedAnnealing.simulation();

        System.out.println("Final approximate solution distance is = " + simulatedAnnealing.getBest().getDistance());
        System.out.println("Tour : " + simulatedAnnealing.getBest());
    }
}
