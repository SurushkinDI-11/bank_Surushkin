package org.example;
import java.util.Scanner;
public class ATM implements InterfaceATM {
    Bank bank = new Bank();
    Scanner sc = new Scanner(System.in);
    int tekushCarta;
    int tekushCardIndex;
    int colvoPopitok = 0;

    @Override
    public void insertCard() {

    }

    @Override
    public void scanCard(int cardPin, boolean dalshe) {
        if (!dalshe) {
            System.out.println("Введите код карты: ");
            tekushCarta = ScannerXXX.nextIn();
        }
        if (tekushCarta == -1) {
            System.out.println("Ввели не правильное значение");
            scanCard(0, false);
        } else {
            if (checkCardNum(tekushCarta)) {
                System.out.print("");
                System.out.println("Введите пин код: ");
                int pinCode = ScannerXXX.nextIn();
                System.out.println(pinCode);
                if (pinCode == -1) {
                    System.out.println("Ввели не правильное значение");
                    scanCard(tekushCarta, true);
                } else {
                    if (zaprositPin(pinCode)) {
                        System.out.println("Вы успешно вошли в личный кабинет!");
                        inputInterface();
                        if (bank.cards.get(tekushCardIndex).isBlocket()) {
                            System.out.println("Карта заблокирована");
                        } else
                            bank.getUserinfo(tekushCardIndex);
                    } else {
                        System.out.println("Не правильный пин код, повторите попытку");
                        colvoPopitok++;
                        if (colvoPopitok >= 3) {
                            bank.cards.get(tekushCardIndex).setBlocket(true);
                            System.out.println("\nкарта заблокирована");
                        }
                        scanCard(tekushCarta, false);
                    }
                }

            }

        }
    }

    @Override
    public boolean checkCardNum(int cardNumber) {
        for (int i = 0; i <= bank.cards.size(); i++) {
            if (tekushCarta == bank.cardIndex(i)) {
                tekushCardIndex = i;
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean zaprositPin(int pinCode) {
        return bank.getPinCode(pinCode, tekushCardIndex);
    }

    @Override
    public void getUserInf() {
        System.out.println();
    }

    @Override
    public void inputInterface() {
        while (true) {
            System.out.println("\nВыбирите действие \n1-пополнить \n2-снять \n3-текущий баланс \n4-вытащить карту");
            switch (sc.nextInt()) {
                case 1 -> popolnenieBalance();
                case 2 -> vivodBalance();
                case 3 -> pokazatBalance();
                case 4 -> pullOutCard();
            }
        }
    }


    @Override
    public void popolnenieBalance() {
        System.out.print("Сумма пополенения: ");
        bank.cards.get(tekushCardIndex).setBalance(bank.cards.get(tekushCardIndex).getBalance() + sc.nextInt());
        System.out.println("успешно, текущий баланс : " + bank.cards.get(tekushCardIndex).getBalance());
    }

    @Override
    public void vivodBalance() {
        System.out.print("Сумма списания: ");
        bank.cards.get(tekushCardIndex).setBalance(bank.cards.get(tekushCardIndex).getBalance() - sc.nextInt());
        System.out.println("успешно, текущий баланс " + bank.cards.get(tekushCardIndex).getBalance());
    }

    @Override
    public void pokazatBalance() {
        System.out.println("баланс: " + bank.cards.get(tekushCardIndex).getBalance());
    }

    @Override
    public void pullOutCard() {
            System.out.println("Удачи!");
            System.exit(0);
    }
}