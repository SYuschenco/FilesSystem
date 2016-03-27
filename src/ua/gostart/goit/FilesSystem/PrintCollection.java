package ua.gostart.goit.FilesSystem;

import java.awt.*;
import java.util.*;
import java.util.List;

public class PrintCollection {

    ArrayList<Files> collectionToPrint;

    public ArrayList<Files> getCollectionToPrint() {
        return collectionToPrint;
    }

    public void setCollectionToPrint(ArrayList<Files> collectionToPrint) {
        this.collectionToPrint = collectionToPrint;
    }

    public void print(ArrayList<Files> collectionToPrint) {

            System.out.println("------------------------------------------------------");
            System.out.println("|Super   |  Object      | Object    |Object | Object |");
            System.out.println("|Name    |  Name        | Field1    |Field2 | Field3 |");
            System.out.println("------------------------------------------------------");
            for (int n = 0; n < collectionToPrint.size(); n++) {
                Object o = collectionToPrint.get(n);


                System.out.println(o);
            }
            System.out.println("------------------------------------------------------");

    }
}
