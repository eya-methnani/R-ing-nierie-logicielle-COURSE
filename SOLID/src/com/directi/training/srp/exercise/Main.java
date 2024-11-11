package com.directi.training.srp.exercise;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        CarManager carManager = new CarManager(carRepository);
        CarFormatter carFormatter = new CarFormatter();

        // Get the best car
        Car bestCar = carManager.getBestCar();
        System.out.println("Best Car: " + bestCar.getBrand() + " " + bestCar.getModel());

        // Get formatted car names
        String carNames = carFormatter.formatCarNames(carRepository.getAllCars());
        System.out.println("Car names: " + carNames);
    }
}
