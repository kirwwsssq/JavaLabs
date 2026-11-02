package org.example.task11;

public class Tree extends Plant{
    public Tree(String name,double height, String type){
        super(name,height,type);
    }
    public void grow(){
        System.out.println("растет быстро");
    }
}
