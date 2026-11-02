package org.example.task13;

public class Athlete {
    String name;
    String sport;
    int age;
    int medals;
    double rating;

    public Athlete(String name, String sport, int age, int medals, double rating) throws InvalidAthleteDataException {
        this.name = name;
        this.sport = sport;
        this.age = age;
        this.medals = medals;
        this.rating = rating;

        if (age < 10 || age > 80) {
            throw new InvalidAthleteDataException("недопустимый возраст:" + age);
        }
        if (medals < 0) {
            throw new InvalidAthleteDataException("кол-во медалей не может быть отрицательным: " + medals);
        }
    }

    public void addMedal() throws MedalUpdateException {
        if (this.rating <= 0) {
            throw new MedalUpdateException("н ельзя добавить мтедаль спортсмену с нулевым или отрицательным рейтингом");
        }
        this.medals++;
    }

    public void updateRating(double newRating) {
        this.rating = newRating;
    }

    public String toString() {
        return "cпортсмен-имя=" + name + ",спорт=" + sport + ", возраст=" + age + ", медали=" + medals + ", рейтинг=" + rating;
    }
}
