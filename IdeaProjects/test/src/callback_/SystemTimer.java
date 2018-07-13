package callback_;
import java.util.*;

public class SystemTimer {
    List<TimeUpdaterCallback> callbacks = new ArrayList<>();

    public void register(TimeUpdaterCallback timerCallBack){
        callbacks.add(timerCallBack);
    }

    public void oneHourHasBeenExpired(){
        for(TimeUpdaterCallback timerCallBack:callbacks){
            timerCallBack.updateTime(System.currentTimeMillis());
        }
    }
}
