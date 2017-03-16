package basic.timer;

import java.util.TimerTask;


public class TimerTaskTest01 extends TimerTask {

    @Override
    public void run() {
        System.out.println("timer is starting");
    }
}
