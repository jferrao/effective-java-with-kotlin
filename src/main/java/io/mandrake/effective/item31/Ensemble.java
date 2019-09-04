package io.mandrake.effective.item31;

public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3);

    private final int size;

    Ensemble(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
