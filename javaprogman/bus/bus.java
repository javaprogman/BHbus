package net.javaprogman.bus;

import java.util.ArrayList;

public abstract class bus implements vehicl {

    private ArrayList<Integer> route;
    private Integer busNumber;

    bus (ArrayList<Integer> route, Integer busNumber){
        this.route = route;
        this.busNumber = busNumber;
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

    @Override
    public void go() {

    }
}
