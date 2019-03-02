package net.javaprogman.bus.Threads;

import net.javaprogman.bus.Bus;

public class TimeGo extends Thread {

    private Bus bus;

    public TimeGo(Bus bus){
        this.bus = bus;
    }

    @Override
    public void run() {
        for (int i = 0; i<=10; i++){

           try {
               System.out.println("Bus with nember: " + bus.getBusNumber() + "go with speed " + bus.getSpeed() );
               //sleep(500);
               join(500);
           } catch (InterruptedException e){
               System.out.println(e);
           }
        }
    }
}
