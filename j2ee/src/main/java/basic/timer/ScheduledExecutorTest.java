package basic.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTest {

    private ScheduledExecutorService service;

    public long start;

    ScheduledExecutorTest() {

        this.service = Executors.newScheduledThreadPool(2);
        this.start = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        ScheduledExecutorTest test = new ScheduledExecutorTest();
        test.timerFirst();
        test.timerSecond();
    }

    public void timerFirst() {
        service.schedule(new Runnable() {
            @Override
            public void run() {
//                System.out.println("timerOne invoked, the time : " + (System.currentTimeMillis() - start));
//                try {
//                    Thread.sleep(4000);
//                }catch (Exception e) {
//                    e.printStackTrace();
//                }

                throw new RuntimeException();
            }
        }, 1000, TimeUnit.MILLISECONDS);
    }

    public void timerSecond() {
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("timerSecond invoked, the time : " + (System.currentTimeMillis() - start));
                try {
                    Thread.sleep(4000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 2000, 500,TimeUnit.MILLISECONDS);
    }
}
