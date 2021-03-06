package ua.gostart.goit.FilesSystem;
import java.util.ArrayList;

public class CollectionListAntipattern {
    
    public ArrayList collectionListAntipattern = new ArrayList();


    public ArrayList getCollectionListAntipattern()
    {
        return collectionListAntipattern;
    }

    public void setCollectionListAntipattern(ArrayList collectionListAntipattern) {
        this.collectionListAntipattern = collectionListAntipattern;
    }

    public void makeCollectionListAntipattern(){
        
        
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


        collectionListAntipattern.add(audioFile);
        collectionListAntipattern.add(audioFile1);
        collectionListAntipattern.add(audioFile2);
        collectionListAntipattern.add(textFile);
        collectionListAntipattern.add(textFile1);
        collectionListAntipattern.add(textFile2);
        collectionListAntipattern.add(imageFile);
        collectionListAntipattern.add(imageFile1);
        collectionListAntipattern.add(imageFile2);


    }

    

    
    @Override
    public String toString() {
        return "CollectionList{" +
                "filesSize=" + collectionListAntipattern.size() +
                '}';
    }
}


