// Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций объектов из данной иерархии.
// Хотя бы одна коллекция должна содержать в себе объекты разных классов.
// 1 Создать класс, который печатает созданные коллекции на экран в виде таблицы.
// Колонки таблицы соответствуют полям объектов.
// Каждая строка в таблице соответствует объекту из коллекции.
// 2 Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().


//Реализовать шифрование текста с помощью алгоритма Цезаря.
//Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java

// //    Покрыть юнит-тестами код к домашним заданиям лекций №4, №5, №9 и №10.
package ua.gostart.goit.FilesSystem;
import java.util.*;

public class Runner {

    public static void main(String[] args) {



        // 1 Создать класс, который печатает созданные коллекции на экран в виде таблицы.
        // для практики использовал разные методы сортировки
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

        System.out.println("Sorted by lyambda ObjectName field ArrayList:");
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
        // field acces
        //System.out.println("collectionListAntipattern.filesSize()=" + collectionListAntipattern.getCollectionListAntipattern().size());
        String filesName = ((Files) collectionListAntipattern.getCollectionListAntipattern().get(0)).filesName;
        System.out.println(filesName);
        System.out.println();

        printCollection.setCollectionToPrint(collectionListAntipattern.collectionListAntipattern);
        System.out.println("Unsorted ObjectList:");
        printCollection.print(collectionListAntipattern.collectionListAntipattern);

        //2 Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().
        CollectionTreeSet collectionTreeSet = new CollectionTreeSet();
        collectionTreeSet.makecollectionTreeSet();


//Реализовать шифрование текста с помощью алгоритма Цезаря.
//Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java

        //в метод (де)кодирования я передаю начальный и конечный символы желаемой таблицы кодировки,
        //сдвиг(ключ) и строку для обработки
        System.out.println("Encode/Decode------------------------------------------------------------------------------------------");

        StringBuilder collectionString = new StringBuilder();
        collectionList.makeCollectionList();
        collectionString.append(collectionList.collectionList.toString());
        String collectionStringOriginal = ""+collectionString;
        System.out.println(collectionStringOriginal.trim());

        System.out.println("Origin line");
        String line = collectionStringOriginal;
        line = line.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        System.out.println(line);

        String encode = EncodeCesar.encode(1, ' ', '~', line);
        String decode = DecodeCesar.decode(1, ' ', '~', encode);
        System.out.println("Decode=" + decode.equals(line));
    }
}

// Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций объектов из данной иерархии.
// Хотя бы одна коллекция должна содержать в себе объекты разных классов.
// 1 Создать класс, который печатает созданные коллекции на экран в виде таблицы.
// Колонки таблицы соответствуют полям объектов.
// Каждая строка в таблице соответствует объекту из коллекции.
// 2 Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().