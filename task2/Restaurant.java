package org.example.task2;

public class Restaurant {
    String name;
    String cuisine;
    double rating;

public Restaurant(String name, String cuisine, double rating){
    this.name=name;
    this.cuisine=cuisine;
    this.rating=rating;
}
public String toString(){
    return name + cuisine + rating;
}

}
