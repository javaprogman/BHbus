package net.javaprogman;

import net.javaprogman.bus.Bus;
import net.javaprogman.bus.MiniBus;
import net.javaprogman.bus.PassengerBus;

import java.util.ArrayList;

public class mainBus {

    public static void main(String[] args) {


        // Создаем маршруты
        ArrayList<Integer> route1 = new ArrayList<>();
        route1.add(10);
        route1.add(20);
        route1.add(30);
        route1.add(60);
        route1.add(90);
        route1.add(125);

        ArrayList<Integer> route2 = new ArrayList<>();
        route2.add(12);
        route2.add(20);
        route2.add(35);
        route2.add(55);
        route2.add(75);
        route2.add(95);

        ArrayList<Integer> route3 = new ArrayList<>();
        route3.add(1);
        route3.add(2);
        route3.add(4);
        route3.add(6);
        route3.add(8);
        route3.add(9);
        route3.add(100);


        Bus bus1 = new MiniBus(route1,123,60);
        Bus bus2 = new PassengerBus(route2,456,50);
        Bus bus3 = new PassengerBus(route3,789,30);

        ArrayList<Bus> busStation = new ArrayList<>();
        busStation.add(bus1);
        busStation.add(bus2);
        busStation.add(bus3);

        //Отправляем всех в маршрут
            for (Bus bus : busStation ) {
                bus.go();
            }

    }
}
