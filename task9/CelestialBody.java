package org.example.task9;

abstract class CelestialBody {
    String name;
    double mass;
    double diameter;

    public CelestialBody(String name, double mass, double diameter) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
    }

    public abstract String getType();

    public abstract String calculateGravity();

    public void displayInfo() {
        System.out.println(getType());
        System.out.println(name);
        System.out.println(mass);
        System.out.println(diameter);
        System.out.println(calculateGravity());
    }

}
