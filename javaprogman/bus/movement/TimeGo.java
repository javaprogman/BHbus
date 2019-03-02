package net.javaprogman.bus.Threads;

import net.javaprogman.bus.Bus;

import java.util.ArrayList;

public class TimeGo extends Thread {

    private Bus bus;

    public TimeGo(Bus bus){
        this.bus = bus;
    }

    @Override
    public void run() {


        // S = V*t -> t = S/V        1/60
        while(!bus.getRoute().isEmpty()) {
            try {
                while ((ArrayList)bus.getRoute().get(0) != S)
                System.out.println("Bus with nember: " + bus.getBusNumber() + "go with speed " + bus.getSpeed());

                this.join(1/bus.getSpeed()*1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
