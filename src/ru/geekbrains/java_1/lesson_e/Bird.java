package ru.geekbrains.java_1.lesson_e;

public class Bird extends Animal {

    private static final int MAX_DISTANCE_RUN = 5;
    private static final int MAX_DISTANCE_SWIT = 0;
    private static final double MAX_HEIGHT = 1;

    public Bird(String name){
        super(name, MAX_DISTANCE_RUN, MAX_DISTANCE_SWIT, MAX_HEIGHT);
    }

    public Bird(String name, int maxDistanceRun, int maxDistanceSwit, double maxHeight){
        super(name, maxDistanceRun, maxDistanceSwit, maxHeight);
    }

    @Override
    public boolean swim(int distance){
        return false;
    }
}
