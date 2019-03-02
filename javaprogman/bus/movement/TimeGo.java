package net.javaprogman.bus.movement;

import net.javaprogman.bus.Bus;

import java.util.ArrayList;

public class TimeGo extends Thread {

    private Bus bus;
    int i = 0;
    double v = 0;
    double f = 1;
    private int passedDistance = 0;

    public TimeGo(Bus bus){
        this.bus = bus;
    }

    @Override
    public synchronized void run() {


        // S = V*t -> t = S/V        1/60
        v = f/bus.getSpeed();
        while( i < bus.getRoute().size()) {
            try {
                while (!new busStop().isStop(bus.getRoute().get(i), passedDistance)){
                   // this.sleep((int)(((double)(1/bus.getSpeed()))*10000));
                    this.sleep((long)(v*1000));
                    //this.wait((1/bus.getSpeed()));
                    passedDistance++;
                    //this.join((1/bus.getSpeed()));
                    //this.notify();
                }
                System.out.println("Bus with nember: " + bus.getBusNumber() + "go with speed " + bus.getSpeed() +
                        " stop on busStop" + i + " distance - " + bus.getRoute().get(i));
                i++;


            } catch (InterruptedException e) {
                System.out.println(e);
            } catch (IllegalMonitorStateException e) {
                System.out.println(e);
            }
        }
        i = 0;
    }
}
