package pointer.list;

public enum Color {
    RED, BLACK;

    public static Color toEnum(String value) {
        return valueOf(value.toUpperCase());
    }
}
