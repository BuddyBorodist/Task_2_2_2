package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCars() {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1, "hatchback"));
        cars.add(new Car("BMW", 3, "sedan"));
        cars.add(new Car("BMW", 5, "sedan"));
        cars.add(new Car("BMW", 7, "sedan"));
        cars.add(new Car("BMW", 8, "coupe"));

        return cars;
    }
}
