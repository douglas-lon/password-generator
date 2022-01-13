package com.utilities;

import java.util.Random;

public class Password {

    public String generator(int length, boolean upp, boolean numb, boolean symb) {
        //0: lowerCase;  1: upperCase;  2: numbers;  3: symbols;
        String[] options = new String[4];
        options[0] = "abcdefghijklmnopqrstuvwyz";
        options[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        options[2] = "0123456789";
        options[3] = "!@#$%&*";

        Random gen = new Random();
        String password = "";
        String aux = "";

        for (int i = 0; i < length; i++) { 

            aux += options[0].charAt(gen.nextInt(options[0].length()));

            if (upp)
                aux += options[1].charAt(gen.nextInt(options[1].length()));
            if (numb)
                aux += options[2].charAt(gen.nextInt(options[2].length()));
            if (symb)
                aux += options[3].charAt((gen.nextInt(options[3].length())));
        }

        for (int i = 0; i < length; i++) {

            password += aux.charAt(gen.nextInt(aux.length()));
        }

        return password;
    }
}
