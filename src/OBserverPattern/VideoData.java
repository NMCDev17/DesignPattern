package OBserverPattern;

public class VideoData extends Subject {
    private String title;
    private String description;
    private String fileName;

    public VideoData(){}
    public VideoData(String title, String description, String fileName)
    {
        this.title = title;
        this.description = description;
        this.fileName = fileName;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.videoChanged(null);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.videoChanged(null);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        this.videoChanged(null);
    }

    private void videoChanged(Object arr)
    {
        this.notificationObserver(null);
    }
}
