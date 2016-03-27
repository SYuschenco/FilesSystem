package ua.gostart.goit.FilesSystem;

import java.util.*;

public class Runner {

    public static void main(String[] args) {


        PrintCollection printCollection = new PrintCollection();
        CollectionList collectionList = new CollectionList();
        collectionList.makeCollectionList();
        printCollection.setCollectionToPrint(collectionList.collectionList);

        System.out.println("Unsorted ArrayList:");
        printCollection.print(collectionList.collectionList);
        // sorted by fields
        Collections.sort(collectionList.collectionList);
        System.out.println("Sorted by Comparable<Files> filesSize field ArrayList:");

        printCollection.print(collectionList.collectionList);
        Comparator<Files> comparator = (o1,o2) -> o1.filesName.compareTo(o2.filesName);
        Collections.sort(collectionList.collectionList, comparator);

        System.out.println("Sorted by lyambda filesName field ArrayList:");
        printCollection.print(collectionList.collectionList);
        Collections.sort(collectionList.collectionList, (o1,o2) -> o1.getFilesName().compareTo(o2.getFilesName()));

        System.out.println("Sorted by lyambdaMethod filesName field ArrayList:");
        printCollection.print(collectionList.collectionList);
        Collections.sort(collectionList.collectionList,(o1,o2) ->{
            int result = o1.filesSize -o2.filesSize;
            //System.out.println(result);
            return result;
        });

        CollectionTreeMap collectionTreeMap = new CollectionTreeMap();
        collectionTreeMap.makecollectionTreeMap();


        // not genericType collection
        CollectionListAntipattern collectionListAntipattern = new CollectionListAntipattern();
        collectionListAntipattern.makeCollectionListAntipattern();
        collectionListAntipattern.getCollectionListAntipattern().get(0);
        // field acces
        System.out.println("collectionListAntipattern.filesSize()=" + collectionListAntipattern.getCollectionListAntipattern().size());
        String filesName = ((Files) collectionListAntipattern.getCollectionListAntipattern().get(0)).filesName;
        System.out.println(filesName);
        System.out.println();

        printCollection.setCollectionToPrint(collectionListAntipattern.collectionListAntipattern);
        System.out.println("Unsorted ObjectList:");
        printCollection.print(collectionListAntipattern.collectionListAntipattern);

        CollectionTreeSet collectionTreeSet = new CollectionTreeSet();
        collectionTreeSet.makecollectionTreeSet();



    }
}

// Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций объектов из данной иерархии.
// Хотя бы одна коллекция должна содержать в себе объекты разных классов.
// 1 Создать класс, который печатает созданные коллекции на экран в виде таблицы.
// Колонки таблицы соответствуют полям объектов.
// Каждая строка в таблице соответствует объекту из коллекции.
// 2 Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().