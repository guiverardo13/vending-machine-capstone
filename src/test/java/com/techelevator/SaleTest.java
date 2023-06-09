package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SaleTest {

    private Sale sut;


    @Before
        //Arrange
    public void setSut(){
        sut = new Sale();}
    private int balance;
    private int totalCost;



    @Test
    public void getChangeCoins_25_cents(){
        balance = 100;
        totalCost = 75;
        String expectedCoins = "1 Quarter. ";
        //Act
        String testCoins = sut.getChangeCoins(balance, totalCost);

        //Assert
        Assert.assertEquals(expectedCoins, testCoins);
    }

    @Test
    public void getChangeCoins_100_cents(){
        balance = 100;
        totalCost = 0;
        String expectedCoins = "4 Quarters. ";
        //Act
        String testCoins = sut.getChangeCoins(balance, totalCost);
        //Assert
        Assert.assertEquals(expectedCoins, testCoins);
    }






}
