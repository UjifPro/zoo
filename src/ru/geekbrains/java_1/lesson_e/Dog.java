package ru.geekbrains.java_1.lesson_e;

public class Dog extends Animal {

    private static final int MAX_DISTANCE_RUN = 500;
    private static final int MAX_DISTANCE_SWIT = 10;
    private static final double MAX_HEIGHT = 1;


    public Dog(String name){
        super(name, MAX_DISTANCE_RUN, MAX_DISTANCE_SWIT, MAX_HEIGHT);
    }

    public Dog(String name, int maxDistanceRun, int maxDistanceSwit, double maxHeight){
        super(name, maxDistanceRun, maxDistanceSwit, maxHeight);
    }

    @Override
    public boolean swim(int distance){
        return super.swimCan(distance);
    }
}
