package com.wcoding.exceptions;

//checked -> Extends the exception class
//unchecked (runtime) -> RunTimeException

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(){
        super("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
