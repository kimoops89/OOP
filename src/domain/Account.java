package domain;

import java.util.Calendar;

public class Account {
 public final static String BANK_NAME = "비트뱅크";
 public final static String ACCOUNT_TYPE = "기본통장";
 public final static String WITHDRAW_SUCCESS = "출금성공";
 public final static String WITHDRAW_FAIL = "잔액부족";
 public final static String DEPOSIT_SUCCESS = "입금성공";
 public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";

 protected String name, id, pw, accountNum, accountType, num, date;
 protected int money;

 public void setName(String name) {
  this.name = name;
 }

 public void setId(String id) {
  this.id = id;
 }

 public void setMoney(int money) {
  this.money = money;
 }

 public void setPw(String pw) {
  this.pw = pw;
 }

 public void setAccountNum() {
  num = "";
  accountNum = "";
  for (int i = 0; i < 3; i++) {
   for (int j = 0; j < 3; j++) {
    num += (int) (Math.random() * 10);
   }
   if (i < 2) {
    accountNum += num + "-" ;
   } else {
    accountNum += num ;
   }
   num = "";
  }
 }

 public void setDate() {
  Calendar cal = Calendar.getInstance();
  int nowYear = cal.get(cal.YEAR);
  int nowMonth = cal.get(cal.MONTH) + 1;
  int nowDate = cal.get(cal.DATE);
  date = nowYear + "년" + nowMonth + "월" + nowDate + "일";

 }

 public String getName() {
  return name;
 }

 public int getMoney() {
  return money;
 }

 public String getId() {
  return id;
 }

 public String getPw() {
  return pw;
 }

 public String getAccountNum() {
  return accountNum;
 }

 public String getDate() {
  return date;
 }

 public String toString() {
  setAccountNum();
  setDate();
  return String.format("%s \n 통장타입 : %s \n 계좌번호 : %s \n 이룸 : %s \n 생성일 : %s \n 잔액 : %s원 ", BANK_NAME,
    ACCOUNT_TYPE, accountNum, name, date, money);
 }
}
