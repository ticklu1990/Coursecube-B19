public class Lab591 {

    public static void main(String args) {

        Thread th1 = new Thread.currentThread();
        MyThread th2 = new MyThread();
        th2.start();
        for (char ch = 'A'; ch < 'L'; ch++) {
            System.out.println(th1.getName() + "\t\t" + ch + "\t" + th1.isDaemon());
        }
        try {

            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + "\t" + i + "\t" + isDaemon());
        }
        try {

            Thread.sleep(500);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}