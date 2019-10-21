package com.spartaglobal.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {

    private List<String> hobbies= new ArrayList<String>();

    public ExampleLists() {
        workingWithOurList();
    }

    private void workingWithOurList(){
        hobbies.add("boxing");
        hobbies.add("netflix");
        hobbies.add("listening to music");
    }

    public void printList(){
        System.out.println("We're using the Iterator");

        for (Iterator<String> iterator = hobbies.iterator(); iterator.hasNext();){ //call iterator object
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
