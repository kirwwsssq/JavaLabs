package org.example.task13;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("бурые медведи");
        try {
            Athlete a1 = new Athlete("Антон Антипов", "хоккей", 20, 8, 4.1);
            Athlete a2 = new Athlete("Михаил Понаморёв", "хоккей", 19, 9, 5.0);
            team.addAthlete(a1);
            team.addAthlete(a2);
            team.printInfo();
        } catch (InvalidAthleteDataException e) {
            System.err.println("ошибка: " + e.getMessage());
        }
        try {
            Athlete a3 = new Athlete("Андрей Кислый", "хоккей", 10, 9, 4.6);
            team.addAthlete(a3);
        } catch (InvalidAthleteDataException e) {
            System.out.println("InvalidAthleteDataException: " + e.getMessage());
        }
        try {
            Athlete athlete = team.findAthlete("Антон Антипов");
            System.out.println("до обновления: " + athlete);
            athlete.updateRating(5.0);
            athlete.addMedal();
            System.out.println("после обновления: " + athlete);

        } catch (AthleteNotFoundException | MedalUpdateException e) {
            System.out.println("ошибка выполнения операции: " + e.getMessage());
        }
        try {
            team.findAthlete("Иван Костров");
        } catch (AthleteNotFoundException e) {
            System.out.println("AthleteNotFoundException: " + e.getMessage());
        }
        try {
            Athlete a4 = new Athlete("игрок4", "хоккей", 20, 0, 0.0);
            team.addAthlete(a4);
            a4.addMedal();
        } catch (InvalidAthleteDataException | MedalUpdateException e) {
            System.out.println("MedalUpdateException: " + e.getMessage());
        }
    }
}