package code.example.tsi.animalexample;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        ArrayList<Animal> pound = new ArrayList<>();
        ArrayList<Flying> skies = new ArrayList<>();
        pound.add(cat);
        pound.add(cat2);


        for(Animal a:pound){

            a.eat("Dinner");
            System.out.println(a.Breathe());
            a.excrete();
            a.reproduce();
            a.sleep(1000);
        }

    }
}
