package common;

import java.awt.Color;
import utils.UtilsUI;

public class Common {

    /* Constants used by program */
    //User managment
    public static int USER_SESSION_ID;
    public static final int SECRETARY_USER_TYPE = 0;
    public static final int ADMIN_USER_TYPE = 1;

    //UI
    public static final Color DEEP_BLUE_COLOR = new Color(UtilsUI.hexadecimalToRGB("1d4f91"));
    public static final Color ORANGED_YELLOW_COLOR = new Color(UtilsUI.hexadecimalToRGB("ffc600"));
    public static final Color ORANGED_COLOR = new Color(UtilsUI.hexadecimalToRGB("ed8900"));
    public static final Color PINK_COLOR = new Color(UtilsUI.hexadecimalToRGB("c964cf"));
    public static final Color SECOND_GRAY = new Color(UtilsUI.hexadecimalToRGB("7D7D7D"));

    //Dates
    public static final boolean BOOLEAN_CURRENT_DATE = true;
    public static final boolean BOOLEAN_NORMAL_DATE = false;

    //Students managment
    /**
     * Para la funcion: StudentService.getAgeAndBirthDayByCURP()
     */
    public static final int GET_BIRTHDATE = 0;
    public static final int GET_AGE = 1;

}
