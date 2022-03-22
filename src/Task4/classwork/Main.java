package Task4.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> noFixCars = new ArrayList<>();
        noFixCars.add(new Car("BMW", 320, new Owner("Oleg", 23, 5), 20000, 2016));
        noFixCars.add(new Car("Mers", 300, new Owner("Artem", 28, 1), 22000, 2017));
        noFixCars.add(new Car("Volvo", 240, new Owner("Vlad", 33, 4), 23000, 2018));
        noFixCars.add(new Car("Volkswagen", 200, new Owner("Dima", 66, 46), 11000, 2011));
        noFixCars.add(new Car("Chevrolet", 150, new Owner("Maryan", 20, 2), 10000, 2013));
        noFixCars.add(new Car("Mazda", 110, new Owner("Pavlo", 43, 13), 9000, 2010));
        noFixCars.add(new Car("Tesla", 500, new Owner("Misha", 70, 50), 50000, 2020));
        noFixCars.add(new Car("Porsche", 600, new Owner("Sergey", 26, 2), 100000, 2022));
        noFixCars.add(new Car("Skoda", 150, new Owner("Olia", 27, 9), 8000, 2006));
        noFixCars.add(new Car("Lexus", 250, new Owner("Diana", 35, 13), 12500, 2011));
        noFixCars.add(new Car("Suzuki", 282, new Owner("Sasha", 33, 13), 5000, 2004));
        List<Car> cars = noFixCars.stream()
                .skip(noFixCars.size() / 2)
                .map(noFixCar -> {
                    noFixCar.setPower((int) Math.round(noFixCar.getPower() * 1.1));
                    return noFixCar;
                })
                .map(newOwner -> {
                    newOwner.setOwner(noFixCars.get((int) (Math.random() * 10)).getOwner());
                    return newOwner;
                })
                .map(drivingExperience -> {
                    if (drivingExperience.getOwner().getYearsOfDriving() < 5 && drivingExperience.getOwner().getAge() > 25) {
                        System.out.println(drivingExperience.getOwner().getName() + " go to courses");
                        drivingExperience.getOwner().setYearsOfDriving(drivingExperience.getOwner().getYearsOfDriving() + 1);
                        return drivingExperience;
                    } else {
                        return drivingExperience;
                    }

                })
                .collect(Collectors.toList());
        System.out.println(cars);
        int sumOfPrices = cars.stream().mapToInt(Car::getPrice).sum();
        System.out.println(sumOfPrices + " need to buy cars");
    }
}
