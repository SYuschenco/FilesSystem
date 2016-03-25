package ua.gostart.goit.FilesSystem;

public class ImageFile extends Files {

    public ImageFile(String filesName, String fileType, int size) {
        super(filesName,fileType,size);
    }

    @Override
    public String getFileType() {
        return "gif";
    }

}
