package basic.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 学习timer类的使用
 */
public class TimerTest04 {

    private Timer timer;
    public long start;


    public TimerTest04() {

        this.timer = new Timer();
        start = System.currentTimeMillis();

    }

    public static void main(String[] args) throws Exception{

        /**
         * timer缺陷 ： 1管理时间缺陷；2 抛出异常曲线
         * 由于timer是基于单线程，绝对时间的问题 使用 ScheduleExcutorService代替 优点是多线程 相对时间
         */
        TimerTest04 timerTest04= new TimerTest04();
        timerTest04.timerFirst();
        timerTest04.timerSecond();

    }

    public void timerFirst() {

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timerOne invoked, the time : " + (System.currentTimeMillis() - start));
                try {
                    Thread.sleep(4000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 1000);
    }

    public void timerSecond() {

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timerSecond invoked, the time : " + (System.currentTimeMillis() - start));

            }
        }, 3000);
    }

}
