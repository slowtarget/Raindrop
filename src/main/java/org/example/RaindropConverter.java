package org.example;

public class RaindropConverter {
    public String convert(int number) {
        String result = "";

        if (number%3 == 0) {
            result += "Pling";
        }

        if (number%5 == 0) {
            result += "Plang";
        }

        if (number%7 == 0) {
            result += "Plong";
        }

        if(result.isEmpty()) {
            result += String.valueOf(number);
        }

        return result;
    }
}
