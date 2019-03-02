package net.javaprogman.bus;

import net.javaprogman.bus.Threads.TimeGo;

import java.util.ArrayList;

public abstract class Bus implements Vehicl {

    private ArrayList<Integer> route;
    private int busNumber;
    private int speed;

    Bus(ArrayList<Integer> route, Integer busNumber, int speed){
        this.route = route;
        this.busNumber = busNumber;
        this.speed = speed;
    }

    public ArrayList<Integer> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<Integer> route) {
        this.route = route;
    }

    public Integer getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }

    public int getSpeed() {
        return speed;
    }

    /*public void setSpeed(int speed) {
        this.speed = speed;
    }*/

    public void go() {
        //Thread threadBus = new TimeGo(this);
       new TimeGo(this).run();

    }
}
