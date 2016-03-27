package ua.gostart.goit.FilesSystem;

public class TextFile extends Files {

    public TextFile(String filesName, String fileType, int size) {
        super(filesName, fileType, size);
    }



    @Override
    public String getFileType() {
        return "txt";
    }


}