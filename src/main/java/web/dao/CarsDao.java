package web.dao;

import web.model.Car;
import java.util.List;

public interface CarsDao {
    List<Car> getCars();
    List<Car> getSomeCars(int count);
}
