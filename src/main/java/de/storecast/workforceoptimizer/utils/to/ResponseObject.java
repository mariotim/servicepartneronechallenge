package de.storecast.workforceoptimizer.utils.to;


public class ResponseObject {
    private int seniors = 0;
    private int juniors = 0;

    public ResponseObject(int seniors, int juniors) {
        this.seniors = seniors;
        this.juniors = juniors;
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
