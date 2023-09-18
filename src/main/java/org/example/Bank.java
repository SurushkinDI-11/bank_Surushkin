package org.example;


import java.util.ArrayList;

public class Bank implements BankInterface {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Integer> pinCods = new ArrayList<>();
    public Bank() {
        names.add("Ilya");
        cards.add(new Card(8346,000,6236, 0));
        names.add("Vlados");
        cards.add(new Card(6435,111,4534, 0));
        names.add("Sasha");
        cards.add(new Card(7343,222,9838, 0));
        names.add("Danya");
        cards.add(new Card(7343,333,9839, 0));
        names.add("Igor");
        cards.add(new Card(7343,444,9831, 0));
    }


    @Override
    public void getUserinfo(int cardIndex) {
       System.out.println("Владелец"+names.get(cardIndex));
    }

    @Override
    public int cardIndex(int index) {
        return cards.get(index).cardNumber;
    }
    public boolean getPinCode(int code, int indexCard) {
        if(cards.get(indexCard).getPin() == code){
            return true;
        }
        return false;
    }
}

