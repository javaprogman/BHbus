package net.javaprogman.bus.movement;

import net.javaprogman.bus.Bus;

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


        // S = V*t -> t = S/V
        // v - вспомогательная переменная для нахождения времени прохождения автобусом единицу пути.
        v = f/bus.getSpeed();
        // пока не приехали на последнюю остановку выполняем цикл
        while( i < bus.getRoute().size()) {
            try {
                //если мы не на остановке едим дальше
                while (!new busStop().isStop(bus.getRoute().get(i), passedDistance)){

                    // подсчитываем пройденную дистанцию.
                    this.sleep((long)(v*1000));
                    passedDistance++;
                }
                //говорим, что мы на оостановке, отыхаем.
                System.out.println("Bus with nember: " + bus.getBusNumber() + "go with speed " + bus.getSpeed() +
                        " stop on busStop" + i + " distance - " + bus.getRoute().get(i));

                this.sleep(2000);
                //устанавливаем следующую остановку (планку для автобуса)
                i++;

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        i = 0;
    }
}
