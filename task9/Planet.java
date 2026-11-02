package org.example.task9;

class Planet extends CelestialBody {
    int moons;

    public Planet(String name, double mass, double diameter, int moons) {
        super(name, mass, diameter);
        this.moons = moons;
    }

    public String getType() {
        return "планета";
    }


    public String calculateGravity() {
        if (diameter <= 0) {
            return "error";

        }
        double radius = diameter / 2.0;
        double gravity = 9.8 * (mass / (radius * radius));
        return gravity + "";
    }

    public void displayInfo() {
        super.displayInfo();
    }
}
