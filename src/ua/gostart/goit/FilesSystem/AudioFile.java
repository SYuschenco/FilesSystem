package ua.gostart.goit.FilesSystem;

public class AudioFile extends Files {


    public AudioFile(String filesName, String fileType, int size) {
        super(filesName,fileType,size);
    }

    @Override
    public String getFileType() {
        return "mp3";
    }

}