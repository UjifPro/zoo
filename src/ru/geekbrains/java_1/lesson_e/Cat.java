package ru.geekbrains.java_1.lesson_e;

public class Cat extends Animal {

    private static final int MAX_DISTANCE_RUN = 200;
    private static final double MAX_HEIGHT = 2;

    public Cat(String name){
        super(name, MAX_DISTANCE_RUN, MAX_HEIGHT);
    }

    public Cat(String name, int maxDistanceRun, int maxDistanceSwit, double maxHeight){
        super(name, maxDistanceRun, maxDistanceSwit, maxHeight);
    }

    @Override
    public boolean swim(int distance) {
        return false;
    }
}
