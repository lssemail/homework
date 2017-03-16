package basic.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 学习timer类的使用
 */
public class TimerTest03 {

    Timer timer;

    /**
     * 在延时指定时间后以指定的时间间隔循环执行定时任务
     */
    public TimerTest03() {

        timer = new Timer();
        timer.schedule(new TimerTaskTest03(), 1000, 2000);

    }

    public static void main(String[] args) {
        new TimerTest03();
    }

}
