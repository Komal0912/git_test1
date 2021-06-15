package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!" ;

    private final String message1="Changes made in the string!!!";

    private final String msg="Editing code to test in jenkins **###++!";


    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println(new App().getMessage1());
        System.out.println(new App().getMsg());
    }

    private final String getMessage() {
        return message;
    }
     private final String getMessage1() {
        return message1;
    }

    private final String getMsg(){
        return msg;
    }

}
