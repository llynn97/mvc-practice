package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGeneratePolicy{
    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
