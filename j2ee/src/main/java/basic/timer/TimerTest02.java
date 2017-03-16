package basic.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 学习timer类的使用
 */
public class TimerTest02 {

    Timer timer;

    /**
     * 在指定时间执行定时任务
     */
    public TimerTest02() {

        Date time = getTime();
        System.out.println("time:" + time);
        timer = new Timer();
        timer.schedule(new TimerTaskTest02(), time);

    }

    public static void main(String[] args) {
        new TimerTest02();
    }

    public Date getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(calendar.SECOND, 0);
        Date date = calendar.getTime();
        return date;
    }


}
