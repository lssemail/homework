package basic.timer;

import java.util.Date;
import java.util.TimerTask;


public class TimerTaskTest03 extends TimerTask {

    @Override
    public void run() {
        Date date = new Date(this.scheduledExecutionTime());
        System.out.println("timer is starting,date: " + date);
    }
}
