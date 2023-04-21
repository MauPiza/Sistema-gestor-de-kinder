package utils;

import java.awt.Color;
import java.time.LocalDate;

public class Utils {

    private static final LocalDate currentDate = LocalDate.now();
    private static int currentDay, currentYear;
    private static String currentMonth;
    private static String currentDateString;

    public static LocalDate getCurrentDate() {
        return currentDate;
    }

    public static int hexadecimalToRGB(String hexCode) {
        return Integer.parseInt(hexCode, 16);
    }

    public static Color castIntToColor(String hexToInt) {
        return new Color(hexadecimalToRGB(hexToInt));
    }

    public static String monthsMapping(String month) {
        String monthNumber = "";
        if (month.substring(0).equals("0")) {
            monthNumber = switch (month) {
                case "01" ->
                    "Enero";
                case "02" ->
                    "Febrero";
                case "03" ->
                    "Marzo";
                case "04" ->
                    "Abril";
                case "05" ->
                    "Mayo";
                case "06" ->
                    "Junio";
                case "07" ->
                    "Julio";
                case "08" ->
                    "Agosto";
                case "09" ->
                    "Septiembre";
                case "10" ->
                    "Octubre";
                case "11" ->
                    "Noviembre";
                case "12" ->
                    "Diciembre";
                default ->
                    "NONE";
            };
        } else {
            monthNumber = switch (month) {
                case "1" ->
                    "Enero";
                case "2" ->
                    "Febrero";
                case "3" ->
                    "Marzo";
                case "4" ->
                    "Abril";
                case "5" ->
                    "Mayo";
                case "6" ->
                    "Junio";
                case "7" ->
                    "Julio";
                case "8" ->
                    "Agosto";
                case "9" ->
                    "Septiembre";
                case "10" ->
                    "Octubre";
                case "11" ->
                    "Noviembre";
                case "12" ->
                    "Diciembre";
                default ->
                    "NONE";
            };
        }
        return monthNumber;
    }

    public static String setActualDate() {
        currentDay = currentDate.getDayOfMonth();
        currentMonth = monthsMapping(String.valueOf(currentDate.getMonthValue()));
        currentYear = currentDate.getYear();
        currentDateString = currentDay + " de " + currentMonth + " del " + currentYear;
        return currentDateString;
    }
}
