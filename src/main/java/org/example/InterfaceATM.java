package org.example;

public interface InterfaceATM {
    void insertCard();
    void scanCard(int cardPin, boolean dalshe );
    boolean checkCardNum(int cardNumber);
    boolean zaprositPin (int pinCode);
    void getUserInf();
    void inputInterface();
    void popolnenieBalance();
    void vivodBalance();
    void pokazatBalance();
    void pullOutCard();
}
