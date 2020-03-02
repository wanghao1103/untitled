package cn.bdqn.test;

public class Thread1 implements  Runnable{

    int tick = 10;
    public void run() {
        while(true){
            if(tick<=0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"抢到了第"+tick--+"张票");
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        new Thread(thread1,"小明").start();
        new Thread(thread1,"小红").start();
        new Thread(thread1,"黄牛党").start();
    }
}
