import java.util.*;

public class Lab680 {

    public static void main(String[] args) {

        System.out.println("About to schedule task");
        new Reminder(5);
        System.out.println("Task Scheduled");

    }

}

class Reminder {

    Timer timer;

    public Reminder(int seconds) {

        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);

    }

    class ReminderTask extends TimerTask {

        public void run() {

            System.out.println("Time's up");
            timer.cancel();

        }

    }

}