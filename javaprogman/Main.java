package net.javaprogman;

import net.javaprogman.bus.Bus;
import net.javaprogman.bus.MiniBus;
import net.javaprogman.bus.PassengerBus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> route1 = new ArrayList<>();
        route1.add(10);
        route1.add(20);

        ArrayList<Integer> route2 = new ArrayList<>();
        route2.add(10);
        route2.add(20);

        Bus bus1 = new MiniBus(route1,1234,60);
        Bus bus2 = new PassengerBus(route1,9876,50);

        bus1.go();
        bus2.go();


    }
}
