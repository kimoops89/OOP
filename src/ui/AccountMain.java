package ui;

/** 
비트뱅크 
기본통방 
계좌번호 : 123-456-789 
이름: 홍길동 
생성일 : 2018년 6월 12일 
잔액 : 10000원 
 
입금하시겠습니까? 
-------------------------- 
비트뱅크 
마이너스통장 
계좌번호 : 123-456-789 
이름: 홍길동 
생성일 :2018년 6월 12일 
잔액 : -10000원 
 
대출하시겠습니까? 
* */

import javax.swing.JOptionPane;
import domain.*;

enum AccountButt {
	종료, 기본통장, 마이너스통장
}

public class AccountMain {
	public static void main(String[] args) {
		Account account = null;
		MinusAccount minusAccount = null;
		AccountButt[] buttons = { AccountButt.종료, AccountButt.기본통장, AccountButt.마이너스통장 };
		while (true) {
			AccountButt select = (AccountButt) JOptionPane.showInputDialog(null, "원하시는 메뉴를 선택하세요.", "비트뱅크",
					JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[1]);
			switch (select) {
			case 종료:
				JOptionPane.showMessageDialog(null, "오늘도 좋은하루 되시길 바랍니다.");
				return;
			case 기본통장:
				account = new Account();
				account.setName(JOptionPane.showInputDialog("이름을 입력하시기 바랍니다."));
				account.setId(JOptionPane.showInputDialog("사용할  ID를 입력하시기 바랍니다."));
				account.setPw(JOptionPane.showInputDialog("비밀번호를 입력하시기 바랍니다."));
				account.setMoney(Integer.parseInt((JOptionPane.showInputDialog("입금하시겠습니까 ?"))));
				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case 마이너스통장:
				minusAccount = new MinusAccount();
				minusAccount.setName(JOptionPane.showInputDialog("이름을 입력하시기 바랍니다."));
				minusAccount.setId(JOptionPane.showInputDialog("사용할  ID를 입력하시기 바랍니다."));
				minusAccount.setPw(JOptionPane.showInputDialog("비밀번호를 입력하시기 바랍니다."));
				minusAccount.setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출받으시겠습니까 ?")));
				JOptionPane.showMessageDialog(null, minusAccount.toString());
				break;
			}
		}
	}
}
