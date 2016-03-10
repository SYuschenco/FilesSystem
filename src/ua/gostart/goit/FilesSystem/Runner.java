package ua.gostart.goit.FilesSystem;

public class Runner {
    public static void main(String[] args) {

        Directory dir = new Directory();

        System.out.println("Создано отношение композиция классов Directory(контейнер) и Files(содержимое)");
        dir.files.setFilesName("FirsFile.img");//тут ошибка наллпоинтер еще не допетрал до конца, но это не по ДЗ
        System.out.println(dir.files.getFilesName());
    }
}
