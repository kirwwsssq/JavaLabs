package org.example.task9;

class Star extends CelestialBody {
    double temperature;

    public Star(String name, double mass, double diameter, double temperature) {
        super(name, mass, diameter);
        this.temperature = temperature;
    }

    public String getType() {
        return "звезда";
    }

    public String calculateGravity() {
        return "гравитация звезды";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("темпа" + temperature);
    }
}
