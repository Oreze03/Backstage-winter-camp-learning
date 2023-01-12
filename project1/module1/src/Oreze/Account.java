package Oreze;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author oreze
 * @creat 2023-01-12-14:22
 */
public class Account {
    private String cardID;//卡号
    private String userName;//用户名
    private String passWord;//密码
    private double Money;//余额
    private double quoteMoney;//单次限额

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }

    public double getQuoteMoney() {
        return quoteMoney;
    }

    public void setQuoteMoney(double quoteMoney) {
        this.quoteMoney = quoteMoney;
    }
}
