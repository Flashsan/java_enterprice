package com.Grigorovich_Alexander.homeWork_2.Task_71;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HelloWorld helloWord = new HelloWorld();

        Class<HelloWorld> reflectHelloWorldClass = HelloWorld.class;
        Method method =reflectHelloWorldClass.getDeclaredMethod("printHelloWorld");
        method.invoke(helloWord,null);



    }
}
