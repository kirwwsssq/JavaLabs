package org.example.task1;

class Apartment {
    String address;
    int rooms;
    double area;

    public Apartment(String address, int rooms, double area) {
        this.address = address;
        this.rooms = rooms;
        this.area = area;
    }

    public double pricePerSquareMeter(double totalPrice) {
        if (area == 0) {
            return 0.0;
        }
        return totalPrice / area;
    }
}
