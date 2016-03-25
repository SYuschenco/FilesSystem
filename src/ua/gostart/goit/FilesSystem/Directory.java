package ua.gostart.goit.FilesSystem;


public class Directory {

    String dirName;
    String dirOwner;
    int dirSize;
    Files files;

    Directory(){
     //   Files files = new Files();
        System.out.println("Создан экземпляр класса Directory");
        System.out.println("Создан экземпляр класса Files");
        System.out.println("Создано отношение композиция классов Directory(контейнер) и Files(содержимое)");

    }

    public Files getFiles() {
        return files;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    public String getDirName() {
        return dirName;
    }

    public String getDirOwner() {
        return dirOwner;
    }

    public int getDirSize() {
        return dirSize;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public void setDirOwner(String dirOwner) {
        this.dirOwner = dirOwner;
    }

    public void setDirSize(int dirSize) {
        this.dirSize = dirSize;
    }
}
