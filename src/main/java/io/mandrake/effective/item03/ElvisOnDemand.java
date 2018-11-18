package io.mandrake.effective.item03;

public class ElvisOnDemand {

    private static class LazyHolder {
        static final ElvisOnDemand INSTANCE = new ElvisOnDemand();
    }

    private ElvisOnDemand() {}


    public static ElvisOnDemand getInstance() {
        return LazyHolder.INSTANCE;
    }

    public void singASong() {

    }
}
