package ru.geekbrains.java_1.lesson_e;

public class Horse extends Animal {

    private static final int MAX_DISTANCE_RUN = 1500;
    private static final int MAX_DISTANCE_SWIT = 100;
    private static final double MAX_HEIGHT = 3;

    public Horse(String name){
        super(name, MAX_DISTANCE_RUN, MAX_DISTANCE_SWIT, MAX_HEIGHT);
    }

    public Horse(String name, int maxDistanceRun, int maxDistanceSwit, double maxHeight){
        super(name, maxDistanceRun, maxDistanceSwit, maxHeight);
    }

    @Override
    public boolean swim(int distance){
        return super.swimCan(distance);
    }
}
