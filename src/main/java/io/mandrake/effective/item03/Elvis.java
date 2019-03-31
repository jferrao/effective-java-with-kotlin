package io.mandrake.effective.item03;

/**
 * Compared to the classical singleton implementation, this one is thread-safe without the need to use synchronized as
 * the singleton instance is created at class-load time. Any subsequent calls to the getInstance() method will return
 * the already created instance. Furthermore, the implementation is slightly optimized as we’ve eliminated the need for
 * checking the value of the Singleton instance, i.e. instance == null
 */
public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {

    }

}
