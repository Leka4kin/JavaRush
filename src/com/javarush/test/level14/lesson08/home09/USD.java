package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Leka4kin on 27.02.2015.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
