package net.javaprogman.bus.movement;

public class busStop implements Stop {

    @Override
    public boolean isStop() {
        return false;
    }

    public boolean isStop(Integer destination, Integer passedDistance) {

        return destination.equals(passedDistance)  ? true : false;
    }
}
