package ua.gostart.goit.FilesSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        PrintCollection printCollection = new PrintCollection();
        printCollection.print();
        printCollection.printTreeMap();


    }
}

// Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций объектов из данной иерархии.
// Хотя бы одна коллекция должна содержать в себе объекты разных классов.
// 1 Создать класс, который печатает созданные коллекции на экран в виде таблицы.
// Колонки таблицы соответствуют полям объектов.
// Каждая строка в таблице соответствует объекту из коллекции.
// 2 Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().