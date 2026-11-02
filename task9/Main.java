package org.example.task9;

public class Main {
    public static void main(String[] args) {
        CelestialBody[] b = new CelestialBody[5];
        b[0] = new Planet("земля", 1.0, 2.1, 1);
        b[1] = new Planet("марс", 0.12, 0.45, 3);
        b[2] = new Planet("юпитер", 315, 11, 56);
        b[3] = new Planet("солнце", 555544, 104, 4567);
        b[4] = new Planet("сатурн", 566670, 203, 84);
        for (int i = 0; i < b.length; i++) {
            CelestialBody body = b[i];
            System.out.println(body.name + ":" + body.getType() + "-" + body.calculateGravity());
        }
    }
    CelestialBody c =new Planet("земля", 1.0, 2.1, 1);
    Planet planet = new Planet("земля", 1.0, 2.1, 1);

}
