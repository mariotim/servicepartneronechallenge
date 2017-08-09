package de.storecast.workforceoptimizer.utils;


public class TransferObject {
    private int rooms = 0;
    private int seniorCapacity = 0;
    private int juniorCapacity = 0;
    private int seniors = 0;
    private int juniors = 0;

    public TransferObject(int rooms, int seniorCapacity, int juniorCapacity) {
        this.rooms = rooms;
        this.seniorCapacity = seniorCapacity;
        this.juniorCapacity = juniorCapacity;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSeniorCapacity() {
        return seniorCapacity;
    }

    public int getJuniorCapacity() {
        return juniorCapacity;
    }

    public int getSeniors() {
        return seniors;
    }

    public void setSeniors(int seniors) {
        this.seniors = seniors;
    }

    public int getJuniors() {
        return juniors;
    }

    public void setJuniors(int juniors) {
        this.juniors = juniors;
    }
}
