package io.mandrake.effective.item03;

/**
 * As of release 1.5 on can simply create a singleton out from an enum type with one element. According to the book,
 * "a single element enum type is the best way to implement a singleton". (?!)
 */
public enum ElvisEnum {

    INSTANCE;

    public void leaveTheBuilding() {

    }

}
