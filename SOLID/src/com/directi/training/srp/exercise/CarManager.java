package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager
{
    private final CarRepository _carRepository;

    public CarManager(CarRepository carRepository)
    {
        _carRepository = carRepository;
    }

    public Car getBestCar()
    {
        List<Car> cars = _carRepository.getAllCars();
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
