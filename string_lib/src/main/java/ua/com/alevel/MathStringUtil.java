package ua.com.alevel;

public final class MathStringUtil {

    private MathStringUtil() { }

    public static boolean isNumeric(String val) {
        for (char c : val.toCharArray()) {
            if (c < 48 || c > 57) {
                return false;
            }
        }
        return true;
    }
}
