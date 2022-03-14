package com.Grigorovich_Alexander.homeWork_2.Task_72;

import com.Grigorovich_Alexander.homeWork_2.Task_71.HelloWorld;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Academy academy = new Academy();

        Class reflectAcademy = Academy.class;
        Method[] methods = reflectAcademy.getDeclaredMethods();
        for (Method method : methods) {
            AcademyInfo academyInfo = method.getAnnotation(AcademyInfo.class);
            if (academyInfo != null) {
                System.out.println("Аннатированный метод: " + method.getName());
            } else {
                System.out.println("Не аннатированный метод: " + method.getName());
            }


        }

    }
}
