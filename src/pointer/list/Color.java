package pointer.list;

public enum Color {
    RED, BLACK;

    public static Color toEnum(String value) {
        return valueOf(value.trim().toUpperCase());
    }

    public static boolean hasValue(String value) {
        Color[] colors = Color.values();
        String valuesUp = value.trim().toUpperCase();

        for (Color c : colors) {
            if (valuesUp.equals(c.name())){
                return true;
            }
        }

        return false;
    }
}
