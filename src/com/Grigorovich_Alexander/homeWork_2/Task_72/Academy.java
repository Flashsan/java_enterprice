package com.Grigorovich_Alexander.homeWork_2.Task_72;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Academy {

    @AcademyInfo(year = 2022)
    public void infoAcademy(){
        System.out.println("I study at Academy 2020.");
    }

    public void AcademyInfo(){
        System.out.println("I study at Academy 2021.");
    }
}
