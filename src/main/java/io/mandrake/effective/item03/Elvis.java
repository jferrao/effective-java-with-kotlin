package io.mandrake.effective.item03;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void singASong() {

    }

}
