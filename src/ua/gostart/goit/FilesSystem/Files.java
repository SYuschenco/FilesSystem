package ua.gostart.goit.FilesSystem;

public class Files {
    public String filesName;
    public String fileType;
    public int size;


    public Files(String filesName, String fileType, int size) {
        this.filesName = filesName;
        this.fileType = fileType;
        this.size = size;
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
        return  "|"      +getClass().getSuperclass().getSimpleName() +
                " \t |  " + getClass().getSimpleName()+
                "\t|   "  + filesName+
                "\t|"    + fileType +
                "\t|"    +
                size     +  "   \t|";
    }


}
