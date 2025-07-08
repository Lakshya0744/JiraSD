package models;

public enum Priority {
    HIGH(1),
    MEDIUM(2),
    LOW(3);

    private int value;
    Priority(int value) {
        this.value = value;
    }

    public int getLevel() {
        return value;
    }
}
