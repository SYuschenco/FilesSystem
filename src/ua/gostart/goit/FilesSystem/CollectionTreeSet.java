package ua.gostart.goit.FilesSystem;
import java.util.*;

public class CollectionTreeSet {

    public TreeSet<Files> collectionTreeSet = new TreeSet<Files>();

    public void makecollectionTreeSet(){
        
        
        AudioFile audioFile = new AudioFile("audio1", "mp3", 55);
        AudioFile audioFile1 = new AudioFile("audio2", "mp3", 56);
        AudioFile audioFile2 = new AudioFile("audio3", "mp3", 57);
        //System.out.println(audioFile.toString());
        TextFile textFile = new TextFile("text1", "txt", 7);
        TextFile textFile1 = new TextFile("text2", "txt", 8);
        TextFile textFile2 = new TextFile("text3", "txt", 9);
        //System.out.println(textFile.toString());
        ImageFile imageFile = new ImageFile("image1", "jpg", 444);
        ImageFile imageFile1 = new ImageFile("image2", "jpg", 445);
        ImageFile imageFile2 = new ImageFile("image3", "jpg", 446);
        //System.out.println(imageFile.toString());


        collectionTreeSet.add(audioFile);
        collectionTreeSet.add(audioFile1);
        collectionTreeSet.add(audioFile2);
        collectionTreeSet.add(textFile);
        collectionTreeSet.add(textFile1);
        collectionTreeSet.add(textFile2);
        collectionTreeSet.add(imageFile);
        collectionTreeSet.add(imageFile1);
        collectionTreeSet.add(imageFile2);




        System.out.println("Sorted by Comparable<Files> filessize field TreeSet:" + collectionTreeSet.size());
        System.out.println("------------------------------------------------------");
        System.out.println("|Super   |  Object      | Object    |Object | Object |");
        System.out.println("|Name    |  Name        | Field1    |Field2 | Field3 |");
        System.out.println("------------------------------------------------------");

        Iterator t=collectionTreeSet.iterator();

        while(t.hasNext()){
            Object o=t.next();
            System.out.println(o);
        }
        System.out.println("------------------------------------------------------");
    }


}


