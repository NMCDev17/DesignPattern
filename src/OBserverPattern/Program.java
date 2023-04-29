package OBserverPattern;

public class Program {
    public static void main(String[] args) {
        VideoData video = new VideoData("cuong.io","no luc de tro nen tot hon","cuong_3");

        //tao ra cac the hien cua video;
        EmailNotification email = new EmailNotification(video);
        PhoneNumberNotification phone = new PhoneNumberNotification(video);
        YoutubeNotification youtube = new YoutubeNotification(video);
        video.setTitle("CuongDev!");
    }
}
