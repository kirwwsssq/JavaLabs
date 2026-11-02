package org.example.task122;

import java.util.List;

public class Car {
    int id;
    String brand;
    String model;
    int rating;
    List<Integer> experReviews;

    public Car(int id, String brand, String model, int rating, List<Integer> experReviews ){
        this.id=id;
        this.brand=brand;
        this.model=model;
        this.rating=rating;
        this.experReviews=experReviews;
    }
    public int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getRating(){
        return rating;
    }
    public List<Integer> getExperReviews() {
        return experReviews;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setExperReviews(List<Integer> experReviews) {
        this.experReviews = experReviews;
    }
    public String toString() {
        return "Car" + id + ",brand='" + brand + "',model='" + model + "',rating=" + rating + ",avgReview=" + getAverageReview();
    }
    public double getAverageReview() {
        double sum=0.0;
        for (int i=0; i<experReviews.size();i++){
            sum=sum+ experReviews.get(i);
        }
        double result = sum/ experReviews.size();
        return result;
    }
}
