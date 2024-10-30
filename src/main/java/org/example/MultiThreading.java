package org.example;

import java.util.concurrent.*;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {

//        final ScheduledExecutorService scheduler= Executors.newScheduledThreadPool(1);
//        ScheduledFuture<?> scheduledFuture=scheduler.scheduleAtFixedRate(new A(),1,2, TimeUnit.SECONDS);
//        scheduler.schedule(()->{
//            System.out.println("Stopping the scheduled service");
//            scheduledFuture.cancel(false);
//            scheduler.shutdown();
//        },20,TimeUnit.SECONDS);
//        ExecutorService service=Executors.newFixedThreadPool(2);
//        ThreadPoolExecutor poolExecutor= (ThreadPoolExecutor) service;
//        System.out.println("a "+poolExecutor.getLargestPoolSize());
//        System.out.println("a "+poolExecutor.getMaximumPoolSize());
//        System.out.println("a "+poolExecutor.getPoolSize());
//        System.out.println("a "+poolExecutor.getActiveCount());
//        System.out.println("a "+poolExecutor.getTaskCount());
//
//
//        service.submit(new A());
//        service.submit(new A());
//
//
//        System.out.println("b "+poolExecutor.getLargestPoolSize());
//        System.out.println("b "+poolExecutor.getMaximumPoolSize());
//        System.out.println("b "+poolExecutor.getPoolSize());
//        System.out.println("b "+poolExecutor.getActiveCount());
//        System.out.println("b "+poolExecutor.getTaskCount());
//
//        service.shutdown();
//        scheduler.schedule(new A(),10,TimeUnit.SECONDS);
//        Thread t1=new Thread(new A(),"a");
//        Thread t2=new Thread(new A(),"b");
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();

//        t1.join();
//        for(int i=200;i<300;i++){
//            System.out.println(i);
//        }
//        t1.join();

    }
}
class A implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            for(int i=0;i<100;i++){
                System.out.println(i);
            }
        }

    }
}
//class B implements Runnable{
//    @Override
//    public void run() {
//        for(int i=100;i<200;i++){
//            System.out.println(i);
//        }
//    }
//}

