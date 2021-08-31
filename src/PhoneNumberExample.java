import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    public static final String VALIDATE = "^[(][0-9]{2}[)][-][(][0]+[0-9]{9}[)]$";

    public PhoneNumberExample() {
    }

    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(VALIDATE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}