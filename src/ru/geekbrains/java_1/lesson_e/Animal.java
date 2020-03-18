package ru.geekbrains.java_1.lesson_e;

public abstract class Animal {

    private String name;
    private int maxDistanceRun;
    private int maxDistanceSwit;
    private double maxHieght;

    public  Animal(String name, int maxDistanceRun, int maxDistanceSwit, double maxHieght){
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwit = maxDistanceSwit;
        this.maxHieght = maxHieght;
    }

    public Animal(String name, int maxDistanceRun, double maxHieght){
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxHieght = maxHieght;
    }

    public String getName(){
        return this.name;
    }

    public boolean run(int distance){
        return (distance<=maxDistanceRun);
    }

    public boolean jump(double height){
        return (height<=maxHieght);
    }

    public abstract boolean swim(int distance);

    public boolean swimCan(int distance){
        return (distance<=maxDistanceSwit);
    }

    public String toString(){
        return this.maxDistanceRun+ " || " + this.maxDistanceSwit + " || " + this.maxHieght;
    }

}
