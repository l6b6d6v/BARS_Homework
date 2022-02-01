package ru.lebedevbars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Тестовое задание

Существует клиент-серверное приложение с БД. С БД может взаимодействовать только сервер.
 Клиент с сервером должен взаимодействовать через Http. В БД должна быть таблица договоров,
  содержащая дату, номер и дату последнего обновления.

Необходимо написать программу, которая отображала бы список договоров.
 В таблице договоров должна быть колонка с признаком актуальности(CheckBox)
 (True если дата последнего обновления договора меньше текущей даты на 60 дней).

Клиент должен быть написан на JavaFx*/


@SpringBootApplication
public class LebedevBarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LebedevBarsApplication.class, args);

        System.out.println();
    }

}
