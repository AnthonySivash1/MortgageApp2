package com.example.margarita.mortgageapp;

import java.text.DecimalFormat;

/**
 * Created by Margarita on 10/27/2017.
 */

public class Mortgage {
    public final DecimalFormat MONEY= new DecimalFormat("$#,##0.00");
    private float amount;
    private int years;
    private float rate;

    public Mortgage()
    {

    }

    public void setAmount(float newAmount)
    {
        if(newAmount>=0)
        {
            amount=newAmount;
        }
    }


    public void setYears(int newYears)
    {
        if(newYears>=0)
        {
            years=newYears;
        }
    }


    public void setRate(float newRate)
    {
        if(newRate>=0)
        {
            rate=newRate;
        }
    }



    public float getAmount()
    {
        return amount;
    }

    public String getFormattedAmount()
    {
        return MONEY.format(amount);
    }

    public float getRate()
    {
        return rate;
    }

    public int getYears()
    {
        return years;
    }

    public float monthlyPayment()
    {
        float mrate=rate/12;   //monthly rate
        double temp=Math.pow(1/(1+mrate), years*12);
        return amount*mrate/(float) (1-temp);
    }

    public String formattedMonthlyPayment()
    {
        return MONEY.format(monthlyPayment());
    }

    public float totalPayment()
    {
        return monthlyPayment()*years*12;
    }

    public String formattedTotalPayment()
    {
        return MONEY.format(totalPayment());
    }

}
