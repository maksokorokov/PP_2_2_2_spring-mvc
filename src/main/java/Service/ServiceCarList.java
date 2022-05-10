package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceCarList {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Camry","Japan",1500));
        carList.add(new Car("Polo","German",1000));
        carList.add(new Car("Oka","Russia",50));
        carList.add(new Car("Tahoe","USA",2000));
        carList.add(new Car("RR","UK",2000));
    }

    public List<Car> show(Integer count) {
        if (count == null) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }


}
