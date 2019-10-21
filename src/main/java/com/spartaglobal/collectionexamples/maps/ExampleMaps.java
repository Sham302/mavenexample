package com.spartaglobal.collectionexamples.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExampleMaps {
    private Map<Integer, String> studentsInClass = new HashMap<>();  //needs to be an object to map key values

    public ExampleMaps(){
        studentsInClass.put(1,"Sham");
        studentsInClass.put(2,"Dana");
        studentsInClass.put(3,"Yaz");
    }

    public String returnValue(int keyNum){
        return studentsInClass.get(keyNum);
    }

    public void loopThroughMap(){
        Collection<String> values = studentsInClass.values();

        for (String data: values){
            System.out.println(data);
        }

        studentsInClass.keySet();
        studentsInClass.
    }

}
