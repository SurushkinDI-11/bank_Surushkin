
package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public interface BankInterface {
    void getUserinfo(int cardIndex);
    int cardIndex (int index);
    boolean getPinCode(int code, int indexCard);
}
