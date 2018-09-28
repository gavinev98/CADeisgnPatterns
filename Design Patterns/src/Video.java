public class Video {

    public String videoName;
    public String videoDescription;


    public Video(String videoName, String videoDescription)
    {
        this.videoName = videoName;
        this.videoDescription = videoDescription;
    }


    public void setVideoName(String videoName)
    {
        this.videoName = videoName;
    }

    public void setVideoDescription(String videoDescription)
    {
        this.videoDescription = videoDescription;
    }

    public String getVideoName()
    {
        return this.videoName;
    }

    public String getVideoDescription()
    {
        return this.videoDescription;
    }

}
