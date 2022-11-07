package web.services;

import web.model.Car;

import java.util.List;

public interface CarsService {
    List<Car> getCars();
    List<Car> getSomeCars(int count);
}
