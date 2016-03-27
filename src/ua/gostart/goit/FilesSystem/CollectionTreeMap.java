package ua.gostart.goit.FilesSystem;


import java.io.File;
import java.util.*;

public class CollectionTreeMap implements Comparable {
    
    public TreeMap<Integer,Files> collectionTreeMap = new TreeMap<Integer,Files>();



    public TreeMap getCollection() {
        return collectionTreeMap;
    }

    @Override
    public int compareTo(Object o) {
        return
               this.collectionTreeMap.getClass().getName().compareTo(o.getClass().getName())
        ;
    }

    public void makecollectionTreeMap(){
        
        
        AudioFile audioFile = new AudioFile("audio1", "mp3", 55);
        AudioFile audioFile1 = new AudioFile("audio2", "mp3", 55);
        AudioFile audioFile2 = new AudioFile("audio3", "mp3", 55);
        //System.out.println(audioFile.toString());
        TextFile textFile = new TextFile("text1", "txt", 7);
        TextFile textFile1 = new TextFile("text2", "txt", 8);
        TextFile textFile2 = new TextFile("text3", "txt", 9);
        //System.out.println(textFile.toString());
        ImageFile imageFile = new ImageFile("image1", "jpg", 444);
        ImageFile imageFile1 = new ImageFile("image2", "jpg", 445);
        ImageFile imageFile2 = new ImageFile("image3", "jpg", 446);
        //System.out.println(imageFile.toString());


        collectionTreeMap.put(1,audioFile );
        collectionTreeMap.put(2,audioFile1);
        collectionTreeMap.put(3,audioFile2);
        collectionTreeMap.put(4,textFile);
        collectionTreeMap.put(5,textFile1);
        collectionTreeMap.put(6,textFile2);
        collectionTreeMap.put(7,imageFile);
        collectionTreeMap.put(8,imageFile1);
        collectionTreeMap.put(9,imageFile2);

        System.out.println("Unsorted(default sorted by keyValue) TreeMap:");
        System.out.println("------------------------------------------------------");
        System.out.println("|Super   |  Object      | Object    |Object | Object |");
        System.out.println("|Name    |  Name        | Field1    |Field2 | Field3 |");
        System.out.println("------------------------------------------------------");

        for (Map.Entry<Integer,Files> entry : collectionTreeMap.entrySet()) {
            //String g = entry.getKey()+"  "+entry.getValue();
            String g = String.valueOf(entry.getValue());
            System.out.println(g + " " + entry.getKey());
        }
        System.out.println("------------------------------------------------------");


        collectionTreeMap.clear();
        collectionTreeMap.put(1,audioFile );
        collectionTreeMap.put(audioFile.compareTo(imageFile1),audioFile1);
        collectionTreeMap.put(audioFile.compareTo(imageFile2),audioFile2);
        collectionTreeMap.put(audioFile.compareTo(audioFile),textFile);
        collectionTreeMap.put(audioFile.compareTo(audioFile1),textFile1);
        collectionTreeMap.put(audioFile.compareTo(audioFile2),textFile2);
        collectionTreeMap.put(audioFile.compareTo(imageFile),imageFile);
        collectionTreeMap.put(audioFile.compareTo(imageFile1),imageFile1);
        collectionTreeMap.put(audioFile.compareTo(imageFile2),imageFile2);

        System.out.println("Unsorted sorted by hz TreeMap:");
        System.out.println("------------------------------------------------------");
        System.out.println("|Super   |  Object      | Object    |Object | Object |");
        System.out.println("|Name    |  Name        | Field1    |Field2 | Field3 |");
        System.out.println("------------------------------------------------------");

        for (Map.Entry<Integer,Files> entry : collectionTreeMap.entrySet()) {
            //String g = entry.getKey()+"  "+entry.getValue();
            String g = String.valueOf(entry.getValue());
            System.out.println(g + " " + entry.getKey());
        }
        System.out.println("------------------------------------------------------");




    }


    

    
    @Override
    public String toString() {
        return "CollectionList{" +
                "filesSize=" + CollectionTreeMap.this +
                '}';
    }
}


