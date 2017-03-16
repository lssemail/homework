package basic.timer;

import java.util.Timer;

/**
 * 学习timer类的使用
 */
public class TimerTest01 {

    Timer timer;

    /**
     * 指定延时时间执行定时任务
     * @param time
     */
    public TimerTest01(int time) {

        timer = new Timer();
        timer.schedule(new TimerTaskTest01(), time * 1000);

    }

    public static void main(String[] args) {
        System.out.println("begin");
        new TimerTest01(3);
    }


}
