package ru.geekbrains.java_1.lesson_e;

public class Main {

    /*TODO
     * Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное
     * Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
     * В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
     * У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
     * При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
     * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
     * @param arg
     */
    public static void main(String[] arg){

        Cat cat1 = new Cat ("Richard");
        Cat cat2 = new Cat ("Tom",1,2,1);
        Dog dog1 = new Dog("Archi");
        Dog dog2 = new Dog("Jack",100,2000,0 );
        Horse horse1 = new Horse("Agat");
        Horse horse2 = new Horse("Oscar", 3000,100,5);
        Bird bird1 = new Bird("Gogo");
        Bird bird2 = new Bird("Fook",10,0,1.6);


        Animal[] zoo = {cat1, cat2, dog1, dog2, horse1, horse2, bird1, bird2};


        int run = 1000;
        int swim = 10;
        double jump = 1.231;

        for(int i = 0; i<zoo.length; i++){
            System.out.println("============================");
            System.out.println(zoo[i].getClass().getSimpleName());
            System.out.println(zoo[i].getName() + "( "+zoo[i].toString() +" )" +  " \n can run (" + run  + ") : " + zoo[i].run(run) + "\n can swimming (" + swim + ") : " + zoo[i].swim(swim) + "\n can jump (" + jump + ") : " + zoo[i].jump(jump));


        }

    }


}
