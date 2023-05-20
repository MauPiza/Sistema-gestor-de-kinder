package utils;

import java.awt.Color;

public class UtilsUI {

    public static int hexadecimalToRGB(String hexCode) {
        return Integer.parseInt(hexCode, 16);
    }

    public static Color castIntToColor(String hexToInt) {
        return new Color(hexadecimalToRGB(hexToInt));
    }
}
