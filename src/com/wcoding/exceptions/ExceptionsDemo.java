package com.wcoding.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        Account account = new Account();
        try {
            account.deposit(10);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            account.withdraw(11);
        } catch (AccountException e) {
            e.printStackTrace();
        }

        try( FileReader fileReader = new FileReader("text.txt")) {
            int value = fileReader.read();
            System.out.println(value);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sayHello (String input){
        System.out.println(input.toLowerCase());
    }
}
