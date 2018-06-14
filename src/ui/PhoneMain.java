package ui;

import javax.swing.JOptionPane;
import domain.Phone;
import domain.CellPhone;
import domain.IPhone;
import domain.GalaxyPhone;

enum PhoneButt {
	통화종료, 전화걸기, 휴대전화, 아이폰, 갤럭시
}

public class PhoneMain {
	public static void main(String[] args) {
		PhoneButt[] buttons = { PhoneButt.통화종료, PhoneButt.전화걸기, PhoneButt.휴대전화, PhoneButt.아이폰, PhoneButt.갤럭시, };
		Phone phone = null;
		CellPhone cellphone = null;
		IPhone iphone = null;
		GalaxyPhone galaxyphone = null;
		while (true) {
			PhoneButt select = (PhoneButt) JOptionPane.showInputDialog(null, "목록", "3Castle 갤럭시11.",
					JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[1]);
			switch (select) {
			case 통화종료:
				return;
			case 전화걸기:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름입력"));
				phone.setPhoneNum(JOptionPane.showInputDialog("번호입력"));
				phone.setCall(JOptionPane.showInputDialog("대화내용입력"));

				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case 휴대전화:
				cellphone = new CellPhone();
				cellphone.setName(JOptionPane.showInputDialog("이름입력"));
				cellphone.setPhoneNum(JOptionPane.showInputDialog("번호입력"));
				cellphone.setCall(JOptionPane.showInputDialog("대화내용입력"));
				cellphone.setPortable(true);
				JOptionPane.showMessageDialog(null, cellphone.toString());
				break;
			case 아이폰 :
				iphone = new IPhone();
				iphone.setName(JOptionPane.showInputDialog("이름입력"));
				iphone.setPhoneNum(JOptionPane.showInputDialog("번호입력"));
				iphone.setData(JOptionPane.showInputDialog("문자내용입력"));
				iphone.setPortable(true);
				JOptionPane.showMessageDialog(null, iphone.toString());
			case 갤럭시 :
				galaxyphone = new GalaxyPhone();
				galaxyphone.setName(JOptionPane.showInputDialog("이름입력"));
				galaxyphone.setPhoneNum(JOptionPane.showInputDialog("번호입력"));
				galaxyphone.setData(JOptionPane.showInputDialog("문자내용입력"));
				galaxyphone.setPortable(true);
				JOptionPane.showMessageDialog(null, galaxyphone.toString());
				
				break;
			}
		}
	}
}