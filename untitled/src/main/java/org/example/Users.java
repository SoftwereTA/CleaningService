package org.example;

public class Users {

   boolean ValidUsername;
   boolean ValidPassword;
   boolean ValidUser;

    public void setValidUsername(boolean validUser) {
        this.ValidUsername = validUser;
    }
    public boolean getValidUsername() {

        return ValidUsername;
    }

    public void setValidPassword(boolean validPassword) {
        this.ValidPassword = validPassword;
    }
    public boolean getValidPassword() {

        return ValidPassword;
    }

    public void setValidUser(boolean validUser) {
        this.ValidUser = validUser;
    }
    public boolean getValidUser() {
        this.CheckingValidUser();
        return ValidUser;
    }

    public void CheckingValidUser() {

        if (getValidPassword()==true && getValidUser()==true) {
            setValidUser(true);
        }
        else {
            setValidUser(false);
        }

    }

    public void setUsername(String username) {
        if (username.equals("Tariq")) {
            setValidUsername(true);
        }
        else if (username.isEmpty()) {
            setValidUsername(false);
        }
        else {
            setValidUsername(false);
        }
    }

    public void setPassword(String password) {
        if (password.equals("password")) {
            setValidPassword(true);
        }
        else if (password.isEmpty()) {
            setValidPassword(false);
        }
        else {
            setValidPassword(false);
        }
    }

    public boolean BlankCheck(String username, String password) {
        if (username.isEmpty() && password.isEmpty()) {
            return true;
        }
        else if (username.isEmpty() && !password.isEmpty()) {
            return true;
        }
        else if (!username.isEmpty() && password.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

}
