package ua.gostart.goit.FilesSystem;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

public class CollectionTreeMap {
    
    public TreeMap collectionTreeMap = new TreeMap();

    public TreeMap getCollection() {
        return collectionTreeMap;
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


        collectionTreeMap.put(audioFile,1);
        collectionTreeMap.put(audioFile1,1);
        collectionTreeMap.put(audioFile2,1);
        collectionTreeMap.put(textFile,1);
        collectionTreeMap.put(textFile1,1);
        collectionTreeMap.put(textFile2,1);
        collectionTreeMap.put(imageFile,1);
        collectionTreeMap.put(imageFile1,1);
        collectionTreeMap.put(imageFile2,1);
    }

    

    
    @Override
    public String toString() {
        return "CollectionList{" +
                "size=" + CollectionTreeMap.this +
                '}';
    }
}


