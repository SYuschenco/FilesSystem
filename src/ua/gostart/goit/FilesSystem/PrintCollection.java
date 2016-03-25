package ua.gostart.goit.FilesSystem;

import java.awt.*;
import java.util.*;
import java.util.List;

public class PrintCollection {

    public void print() {
        CollectionList collectionList = new CollectionList();
        collectionList.makeCollectionList();
        System.out.println("collectionList.size()=" + collectionList.collectionList.size());
        //new GFrame();
        System.out.println(collectionList.getCollection().get(0).filesName);
            System.out.println("------------------------------------------------------");
            System.out.println("|Super   |  Object      | Object    |Object | Object |");
            System.out.println("|Name    |  Name        | Field1    |Field2 | Field3 |");
            System.out.println("------------------------------------------------------");

            for (int n = 0; n < collectionList.getCollection().size(); n++) {
                Object o = collectionList.getCollection().get(n);


                System.out.println(o);
            }
            System.out.println("------------------------------------------------------");

    }

    public void printTreeMap() {
        CollectionTreeMap collectionTreeMap = new CollectionTreeMap();
        collectionTreeMap.getCollection();
        System.out.println("collectionTreeMap.size()=" + collectionTreeMap.getCollection().size());
        //new GFrame();
        System.out.println(collectionTreeMap.getCollection().get(0));
        System.out.println("ObjectName, ObjectField1, ObjectField2, ObjectField3");

        for (int n = 0; n < collectionTreeMap.getCollection().size(); n++) {
            Object o = collectionTreeMap.getCollection().get(n);


            System.out.println(o);
        }

    }
//    public void printSort(List collectionList){
//        //new GFrame();
//        System.out.println("ObjectName, ObjectField1, ObjectField2, ObjectField3");
//
//        for (int n=0; n < collectionList.size();n++){
//            Object o0 = collectionList.get(0).getClass().getSimpleName();
//            Object o = collectionList.get(n).getClass().getSimpleName();
//            if (o > o0)
//
//
//            System.out.println(o);
//        }





}
