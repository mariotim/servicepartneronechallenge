package de.storecast.workforceoptimizer.utils.to;


public class RequestObject {
    private int rooms = 0;
    private int seniorCapacity = 0;
    private int juniorCapacity = 0;

    public RequestObject() {
    }

    public RequestObject(int rooms, int seniorCapacity, int juniorCapacity) {
        this.rooms = rooms;
        this.seniorCapacity = seniorCapacity;
        this.juniorCapacity = juniorCapacity;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setSeniorCapacity(int seniorCapacity) {
        this.seniorCapacity = seniorCapacity;
    }

    public void setJuniorCapacity(int juniorCapacity) {
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
}
