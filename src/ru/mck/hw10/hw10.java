package ru.mck.hw10;

public class hw10 {

    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);


    }

    public static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName.toUpperCase());
    }

    public static void task3() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";

        String fullName = lastName + " " + firstName + " " + middleName;
        fullName =fullName.replace('ё', 'е');

        System.out.println(fullName);

    }
}
