package org.example;

public class Card {
    public int cardNumber;
    private int CVV;
    private int PIN;
    private int balanceOnCard;
    boolean blocket = true;

    public Card(int cardNumber, int CVV, int PIN, int balanceOnCard) {
        this.cardNumber=cardNumber;
        this.CVV=CVV;
        this.PIN=PIN;
        this.balanceOnCard=balanceOnCard;
    }
    public int getPin() {
        return PIN;
    }

    public int getCvv() {
        return CVV;
    }

    public int getBalance() {
        return balanceOnCard;
    }

    public void setBalance(int balance) {
        this.balanceOnCard = balance;
    }
    public boolean isBlocket() {
        return blocket;
    }

    public void setBlocket(boolean blocket) {
        this.blocket = blocket;
    }

}
