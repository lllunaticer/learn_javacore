package callback_;

public class WebsiteTimeUpdaterCallback implements TimeUpdaterCallback{
    @Override
    public void updateTime(long t){
        System.out.println(t);
    }
}
