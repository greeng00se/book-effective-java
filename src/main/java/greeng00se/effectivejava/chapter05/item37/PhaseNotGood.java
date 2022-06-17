package greeng00se.effectivejava.chapter05.item37;

public enum PhaseNotGood {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

        private static final Transition[][] TRANSITIONS = {
                { null, MELT, SUBLIME },
                { FREEZE, null, BOIL },
                { DEPOSIT, CONDENSE, null }
        };

        public static Transition from(PhaseNotGood from, PhaseNotGood to) {
            return TRANSITIONS[from.ordinal()][to.ordinal()];
        }
    }
}
