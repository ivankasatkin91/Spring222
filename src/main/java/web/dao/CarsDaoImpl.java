package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDaoImpl implements CarsDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"Peugeot", "Peugeot 407"));
        cars.add(new Car(2, "Hyundai", "Getz"));
        cars.add(new Car(3, "Citroen", "C4 Picasso"));
        cars.add(new Car(4, "Ford", "Ford Kuga"));
        cars.add(new Car(5, "Opel", "Opel Astra"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return cars.stream()
                .filter(t -> t.getId() <= count)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
