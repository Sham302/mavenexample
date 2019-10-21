package com.spartaglobal.collectionexamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeQueue {
    private Deque<String> carPark = new LinkedList<>();

    public ExampleDeQueue() {
        carPark.add("car1");
        carPark.add("car2");
        carPark.add("car3");
    }

    public void workingWithOurDequeue(){
        for(String car: carPark ){
            System.out.println(car);
        }

        System.out.println(carPark.peekLast());
    }
}
