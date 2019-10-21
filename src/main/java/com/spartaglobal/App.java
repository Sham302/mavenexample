package com.spartaglobal;

import com.spartaglobal.collectionexamples.ExampleDeQueue;
import com.spartaglobal.collectionexamples.ExampleLists;
import com.spartaglobal.collectionexamples.ExampleQueues;
import com.spartaglobal.collectionexamples.ExampleSets;
import com.spartaglobal.collectionexamples.maps.ExampleMaps;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args ){
        //ExampleSets exampleSets = new ExampleSets();
        //exampleSets.workingWithourSet();
        //exampleSets.printSet();

        //ExampleLists exampleLists = new ExampleLists();
        //exampleLists.printList();


        //ExampleQueues exampleQueues = new ExampleQueues();
        //exampleQueues.queueRunner();

       // ExampleDeQueue exampleDeQueue = new ExampleDeQueue();
        //exampleDeQueue.workingWithOurDequeue();

        ExampleMaps exampleMaps = new ExampleMaps();
        System.out.println(exampleMaps.returnValue(2));
        exampleMaps.loopThroughMap();
    }



}
