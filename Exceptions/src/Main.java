//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        boolean result;
        result = checkingParam("Alexey", "DnJ_34", "DnJ_34");  System.out.println(result);
        result = checkingParam("Алексей", "RhN_37", "RhN_37");  System.out.println(result);
        result = checkingParam("Alexey", "WkU+38","WkU+38");  System.out.println(result);
        result = checkingParam("Alexey", "HdE_36", "GdTh_35");  System.out.println(result);
    }

    static boolean checkingParam(String login, String password, String confirmPassword) {
        try {
             Parameters params = new Parameters(login, password, confirmPassword);
             params.print();  return true;
        } catch (WrongLoginException e) {
            System.out.println("Ошибка в login");
            System.out.println(e.getMessage());
            return false;
        }
        catch (WrongPasswordException e) {
            System.out.println("Ошибка в password");   System.out.println(e.getMessage());
            System.out.println("Проверьте и confirmPassword: "+ confirmPassword);
            return false;
        }
    }
}

class WrongLoginException extends Exception{
    WrongLoginException(String login){
        String message;   message = STR."В login должны быть только латинские буквы, цифры и _ . Длина login - не более 20. Нынешний login - \{login}";
        super(message);
    }
}

class WrongPasswordException extends Exception{
    WrongPasswordException(String password){
        String message;  message = STR."В password должны быть только латинские буквы, цифры и _ . Длина password -не более 20. Нынешний password - \{password}";
        super(message);
    }
}