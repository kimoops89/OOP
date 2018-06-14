package domain;

public class MinusAccount extends Account {
 public final static String BANK_NAME = "비트뱅크";
 public final static String ACCOUNT_TYPE = "마이너스통장";
 
 public void setMoney(int money) {
  super.money = (-money) ;
 }
 
 public String toString() {
  setAccountNum();
  setDate();
  return String.format("%s \n 통장타입 : %s \n 계좌번호 : %s \n 이룸 : %s \n 생성일 : %s \n 잔액 : %s원 ", BANK_NAME,
    ACCOUNT_TYPE, accountNum, name, date, money);
 }
}
