package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component("carService")
public class CarService {
    List<Car> listOfCars = List.of(
            new Car("Lada", "Sedan", 140),
            new Car("Bugatti", "Veron", 2000),
            new Car("Ford", "Focus", 350),
            new Car("Porshe", "Cayenne", 350),
            new Car("MersedesBenz", "A5", 600));

    public List<Car> getListOfCars(int index){
        if (index < 1) {
            System.out.println("Укажите корректное число автомобилей");
            return null;
        } else {
            if (index >= 5) {
                return listOfCars;
            } else {
                return listOfCars.subList(0, index);
            }
        }
    }
}
