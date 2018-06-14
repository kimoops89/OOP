package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;
import ui.Butt;

enum Butt {
	종료, 입력, 결과, 성적입력, 성적출력, 부서별입력, 부서별출력, 로또시작, 로또출력
}

public class Main {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.종료, Butt.입력, Butt.결과, Butt.성적입력, Butt.성적출력, Butt.부서별입력, Butt.부서별출력, Butt.로또시작,
				Butt.로또출력, };
		BMI[] arr = new BMI[2];
		BMI bmi = null;
		Grade[] arr1 = new Grade[2];
		Grade grade = null;
		Salary[] arr2 = new Salary[2];
		Salary salary = null;
		Lotto[] arr3 = new Lotto[5];
		Lotto lotto = null;
		// int[] ball = null;
		int count = 0, start = 0, prise = 0;
		String out = "" , output = "";
		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, "어디로 가야하오?", "한번 놀아볼까? 출바을 ~ ",
					JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[1]);
			switch (select) {
			case 종료:
				return;
			case 입력:
				bmi = new BMI();
				bmi.setName(JOptionPane.showInputDialog("이름을 입력하시오.."));
				bmi.setHei(Double.parseDouble(JOptionPane.showInputDialog("키를 입력하시오.")));
				bmi.setWei(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력하시오.")));
				bmi.setResult();
				arr[count] = bmi;
				count++;
				break;
			case 결과:
				for (int i = 0; i < arr.length; i++) {
					out += arr[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, out);
				break;
			case 성적입력:
				grade = new Grade();
				grade.setName(JOptionPane.showInputDialog("이름을 입력해주세요."));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력해주세요.")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("수학점수 입력해주세요.")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("영어점수 입력해주세요.")));
				grade.setTotal();
				grade.setAvg();
				arr1[count] = grade;
				count++;
				break;
			case 성적출력:
				for (int i = 0; i < arr.length; i++) {
					out += arr1[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, out);
				break;
			case 부서별입력:
				salary = new Salary();
				salary.setDept(JOptionPane.showInputDialog("부서명을 입력해주세요."));
				salary.setName(JOptionPane.showInputDialog("이름을 입력해주세요."));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉을 입력해주세요.")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("보너스를 입력해주세요.")));
				salary.setTotal();
				arr2[count] = salary;
				count++;
				break;
			case 부서별출력:
				for (int i = 0; i < arr2.length; i++) {
					out += arr2[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, out);
				break;

			case 로또시작:
				lotto = new Lotto();
				prise = (Integer.parseInt(JOptionPane.showInputDialog("얼마를 구매하시겠습니까 ? \n (1000원 ~ 5000원)")));
				start = prise / 1000;
				for(int i = 0 ; i < start ; i++) {
				lotto.setBall1();
				lotto.setBall2();
				lotto.setBall3();
				lotto.setBall4();
				lotto.setBall5();
				lotto.setBall6();
				arr3[i] = lotto ;
				 out += arr3[i].toString();
				}
				break;
			case 로또출력:
				// start = prise / 1000 ;
				// System.out.println(start);
				 JOptionPane.showMessageDialog(null, out);
				break;
			default:
				return;
			// }
			}
		}
	}
}