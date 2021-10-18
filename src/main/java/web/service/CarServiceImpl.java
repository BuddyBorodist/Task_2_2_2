package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsCount(Integer count) {
        List<Car> Cars = carDao.getCars();
        if (count == null || count > Cars.size()) {
            return Cars;
        } else {
            return Cars.subList(0, count);
        }
    }
}
