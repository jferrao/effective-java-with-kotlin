package io.mandrake.effective.item03;

public class ElvisCaller {

    public static void main(String[] args) {

        // Thread-safe singleton
        final Elvis elvis = Elvis.getInstance();
        System.out.println(elvis.toString());

        final Elvis theKing = Elvis.getInstance();
        System.out.println(theKing.toString());

        // Thread-safe with initialization-on-demand holder idiom
        final ElvisOnDemand elvisOnDemand = ElvisOnDemand.getInstance();
        System.out.println(elvisOnDemand.toString());

        final ElvisOnDemand theKingOnDemand = ElvisOnDemand.getInstance();
        System.out.println(theKingOnDemand.toString());

        // Enum (why?)
        final ElvisEnum elvisEnum = ElvisEnum.INSTANCE;
        System.out.println(elvisEnum.toString());

        final ElvisEnum theKingEnum = ElvisEnum.INSTANCE;
        System.out.println(theKingEnum.toString());

    }

}
