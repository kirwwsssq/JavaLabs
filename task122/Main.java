package org.example.task122;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry", 2, List.of(5, 5, 5)));
        cars.add(new Car(2, "BMW", "X5", 3, List.of(2, 3, 2)));
        cars.add(new Car(3, "Audi", "A4", 4, List.of(4, 4, 5, 4)));
        cars.add(new Car(4, "Kia", "Rio", 2, List.of(3, 3, 3)));
        cars.add(new Car(5, "BMW", "M3", 5, List.of(5, 5, 5, 5)));
        cars.add(new Car(6, "Ford", "Focus", 2, List.of(1, 2, 2)));
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        Iterator<Car> carIterator = cars.iterator();
        while (carIterator.hasNext()) {
            Car currentCar = carIterator.next();
            if (currentCar.getAverageReview() < 3.0) {
                carIterator.remove();
            }
        }
        System.out.println("после удаления со средним < 3");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (int i = 0; i < cars.size(); i++) {
            Car currentCar = cars.get(i);
            if (currentCar.getAverageReview() >= 4.0) {
                int oldRating = currentCar.getRating();
                currentCar.setRating(oldRating + 1);
            }
        }
        System.out.println("\nпосле повышения рейтинга >= 4");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("\nпечать автомобилей с рейтингом 5");
        printCars(cars, 5);

        Collections.sort(cars, new Comparator<Car>() {
            public int compare(Car car2, Car car1) {
                int compareReview = Double.compare(car2.getAverageReview(), car1.getAverageReview());
                if (compareReview == 0) {
                    return car1.getBrand().compareTo(car2.getBrand());
                }
                return compareReview;
            }
        });
        System.out.println("\nотсортированный список: ID, бренд, ср.рейтинг");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println("id:" + car.getId() + "бренд:" + car.getBrand() + "средний рейтинг:" + car.getAverageReview());
        }
    }
    public static void printCars(List<Car> cars, int rating) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (car.getRating() == rating) {
                System.out.println(car);
            }
        }
    }
}