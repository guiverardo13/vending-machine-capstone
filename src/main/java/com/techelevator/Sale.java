package com.techelevator;
//this will contain a method for making change into proper coin amounts. {i'm excited to try and figure this one out!}
public class Sale {
    private int changeTotal;


    public Sale() {

    }

    public String getChangeCoins(int balance, int totalCost) {
        if (balance > totalCost) {
            changeTotal = balance - totalCost;
            int[] coins = new int[3];//{numofQuarters,numofDimes,numofNickels}
            String[] denominations = {"Quarter", "Dime", "Nickel"};
            //COIN LOGIC
            while (changeTotal > 0) {
                if (changeTotal >= 25) {
                    changeTotal -= 25;
                    coins[0] += 1;
                } else if (changeTotal >= 10) {
                    changeTotal -= 10;
                    coins[1] += 1;
                } else if (changeTotal >= 5) {
                    changeTotal -= 5;
                    coins[2] += 1;
                }
            }

            String finalCoins = "";
            for (int i = 0; i < coins.length; i++) {
                if (coins[i] > 1) {
                    finalCoins = finalCoins + coins[i] + " " + denominations[i] + "s. ";
                } else if (coins[i] == 1) {
                    finalCoins = finalCoins + coins[i] + " " + denominations[i] + ". ";
                }
            }
            return finalCoins;

        } else if (balance == totalCost){
            return "You receive $0.00 in change. ";
        } else { return "You do not have enough in your balance!";}
    }
}


