package com.wcoding.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class ExceptionsDemo {
    public static void show() {

        try(FileReader fileReader = new FileReader("text.txt")) {
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void sayHello (String input){
        System.out.println(input.toLowerCase());
    }
}
