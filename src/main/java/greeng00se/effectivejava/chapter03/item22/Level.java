package greeng00se.effectivejava.chapter03.item22;

public enum Level {
    LOW(1), MEDIUM(2), HIGH(3);

    private final int code;

    Level(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
