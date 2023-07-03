package org.example;

public class User {

    private String password;

    public void initPassword(PasswordGeneratePolicy passwordGeneratePolicy) {
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGeneratePolicy.generatePassword();

        if (password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
