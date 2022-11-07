package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;
import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {

    private CarsDao carsDao;

    @Autowired
    public CarsServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCars() {
       return carsDao.getCars();
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return carsDao.getSomeCars(count);
    }
}
