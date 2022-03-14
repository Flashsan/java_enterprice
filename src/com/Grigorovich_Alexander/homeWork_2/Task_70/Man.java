package com.Grigorovich_Alexander.homeWork_2.Task_70;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Man {
    private String name;
    private String nationality;
    public int age;

    private static Class<Man> manClass = Man.class;

//    public Man(String name, String nationality, int age) {
//        this.name = name;
//        this.nationality = nationality;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello " + getName());
    }

    public void informationAboutMan() {
        System.out.println("Имя " + getName()
                + "\t" + "Национальность: " + getNationality()
                + "\t" + "Возраст: " + getAge()
        );
    }

    public void whatAge() {
        System.out.println("Возраст: " + getAge());
    }


    private void getDeclaredFields() {
        System.out.println("Информация о переменных:");
        Field[] declaredFields = manClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }

    //возвращает переменную по имени
    private void getDeclaredFieldFromName() {
        System.out.println("Возвращает переменную по имени:");
        try {
            Field ageField = manClass.getDeclaredField("age");
            System.out.println(ageField);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    //возвращает public переменные
    private void getFields() {
        System.out.println("Возвращает public переменные");
        Field[] fields = manClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

    }

    private void getDeclaredMethods() throws NoSuchMethodException {
        System.out.println("информация о всех объявленных методов в классе:");
        Method[] declaredMethods = manClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
    }

    public void informationAboutClass() throws NoSuchFieldException, NoSuchMethodException {
        getDeclaredFields();
        getDeclaredFieldFromName();
        getFields();
        getDeclaredMethods();


    }
}
