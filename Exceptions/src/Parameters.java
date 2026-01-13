import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parameters {
    String login;
    String password;
    String confirmPassword;

    Parameters(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(login); boolean result = matcher.matches();
        if (!result || login.length()>=20) throw new WrongLoginException(login);
        matcher = pattern.matcher(password); result = matcher.matches();
        if ((!result || password.length()>=20) || (!password.equals(confirmPassword))) throw new WrongPasswordException(password);
        this.login = login;   this.password = password;
        this.confirmPassword = confirmPassword;
    }

    void print() { System.out.printf("Login: %s; Password: %s\n", login,password); }
}
