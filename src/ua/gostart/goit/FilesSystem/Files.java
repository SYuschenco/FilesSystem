package ua.gostart.goit.FilesSystem;

public class Files implements Comparable<Files> {
    public String filesName;
    public String fileType;
    public int filesSize;


    public Files(String filesName, String fileType, int filesSize) {
        this.filesName = filesName;
        this.fileType = fileType;
        this.filesSize = filesSize;
    }

    public String getFilesName() {
        return filesName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFilesName(String filesName) {
        this.filesName = filesName;
    }

    @Override
    public String toString() {
        //new GFrame();
        return  "|"      +getClass().getSuperclass().getSimpleName() +
                " \t |  " + getClass().getSimpleName()+
                "\t|   "  + filesName+
                "\t|"    + fileType +
                "\t|"    +
                filesSize +  "   \t|";

    }


    @Override
    public int compareTo(Files other) {
        return
                //(this.filesName.compareTo(other.filesName));
               this.filesSize-other.filesSize;
    }
}
