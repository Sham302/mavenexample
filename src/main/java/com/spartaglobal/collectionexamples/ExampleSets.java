package com.spartaglobal.collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class ExampleSets {

    private Set<String> newSet = new HashSet<String>();

    public void workingWithourSet(){
        newSet.add("cheese");
        newSet.add("chicken");
        newSet.add("rice");
    }

    public void printSet(){
        System.out.println(newSet.contains("rice"));

        for (String shoppingItem: newSet){
            System.out.println(shoppingItem);
        }
    }

}
