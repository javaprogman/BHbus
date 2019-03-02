package net.javaprogman.bus;

import java.util.ArrayList;

public class PassengerBus extends Bus {

    public PassengerBus(ArrayList<Integer> route, Integer busNumber, int speed) {
        super(route, busNumber, speed);
    }

    @Override
    public void go() {
        super.go();
    }
}
