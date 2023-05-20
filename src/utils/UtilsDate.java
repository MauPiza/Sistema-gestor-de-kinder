package utils;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class UtilsDate {

    private static final LocalDate currentDate = LocalDate.now();
    private static int day, year;
    private static String formatedDateString, month;
// DATES MANAGMENT
//  Mapping date

    public static String monthsMapping(String month) {
        String monthNumber;
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
                    "Mes no válido";
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
                    "Mes no válido";
            };
        }
        return monthNumber;
    }

    /**
     * Función que da formato a las fechas
     *
     * @param isCurrentDay Si es true, devolverá la fecha actual false devuelve
     * una fecha cualquiera
     * @param date Fecha indicada por el usuario
     * @return devuelve la fecha formateada, Ej. '01 de junio del 2023'
     */
    public static String getFormatedDate(boolean isCurrentDay, LocalDate date) {
        if (isCurrentDay) {
            day = currentDate.getDayOfMonth();
            month = monthsMapping(String.valueOf(currentDate.getMonthValue()));
            year = currentDate.getYear();
            formatedDateString = day + " de " + month + " del " + year;
        } else {
            day = date.getDayOfMonth();
            month = monthsMapping(String.valueOf(date.getMonthValue()));
            year = date.getYear();
            formatedDateString = day + " de " + month + " del 20" + year;
        }
        return formatedDateString;
    }
}
