package OBserverPattern;

import java.util.Objects;

public class EmailNotification extends Observer {
    public EmailNotification(Subject subject)
    {
        this.subject = subject;
        subject.AttachObserver(this);
    }

    @Override
    public void notification(Objects aar) {
        try {
            VideoData video = (VideoData) this.subject;
            System.out.format("\nNotify all subscribers via EMAIL with new data" +
                    "\n\tName: %s" +
                    "\n\tDescription: %s" +
                    "\n\tFile name: %s", video.getTitle(), video.getDescription(), video.getFileName());
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
}
