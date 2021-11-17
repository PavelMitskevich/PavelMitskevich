package second;

import second.exeption.WrongLoginException;
import second.exeption.WrongPasswordException;

import java.util.regex.Pattern;

public class AuthenticationImpl implements AuthenticationService {

    @Override
    public boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception {
        if (!login.matches("\\w+") || login.length() > 19) {
            throw new WrongLoginException("В поле ЛОГИН введены некорректные данные");
        }
        if (!Pattern.matches("\\w+", password) || password.length() > 19) {
            throw new WrongPasswordException("В поле ПАРОЛЬ введены некорректные данные");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
