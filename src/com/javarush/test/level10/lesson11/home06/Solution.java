package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public Human(int age)
        {
            this.age = age;
        }

        public Human(int age, boolean sex)

        {
            this.age = age;
            this.sex = sex;
        }

        public Human(String lastName)
        {

            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;

            this.age = age;
        }

        public Human(int height, int weight, boolean sex)
        {
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String lastName, String firstName, int weight, int height)
        {

            this.lastName = lastName;
            this.firstName = firstName;
            this.weight = weight;
            this.height = height;
        }

        public Human(boolean sex, String firstName, String lastName, int age, int weight, int height)
        {

            this.sex = sex;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, String lastName)
        {

            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(boolean sex, String firstName)
        {

            this.sex = sex;
            this.firstName = firstName;
        }

        public Human(boolean sex)
        {

            this.sex = sex;
        }

        //напишите тут ваши переменные и конструкторы
        private boolean sex;
        private String firstName;
        private String lastName;
        private int age;
        private int weight;
        private int height;
    }
}
