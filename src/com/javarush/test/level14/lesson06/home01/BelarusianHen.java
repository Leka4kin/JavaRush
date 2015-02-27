package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Leka4kin on 23.02.2015.
 * <getDescription() родительского класса>  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
 */
public class BelarusianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 10;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
