import java.util.regex.*;


public class Password {


    public static Boolean checkPassword(String password){
        Pattern pattern = Pattern.compile(password);
        Matcher matcher = pattern.matcher("\b(?=[a-z]+[A-Z]+|[A-Z]+[a-z]+)[a-zA-Z0-9]{8,25}\b");
        return matcher.matches();
    }
}
