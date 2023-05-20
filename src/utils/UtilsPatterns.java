package utils;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JTextField;

public class UtilsPatterns {

    private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z ]*$");

    public static boolean validateOnlyCharacters(JTextField textField) {
        Matcher matcher = PATTERN.matcher(textField.getText());
        return matcher.matches();
    }
}
