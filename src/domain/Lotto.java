package domain;

public class Lotto {
	/*
	 * 로또 추첨 1~45까지 볼 6개 중복불허 최대 5천원 얼마치를 구입하시겠습니까? 1 2 3 4 5
	 */
	String result;
	int money = 0 , start = 0 ;
	int ball1 = 0, ball2 = 0, ball3 = 0, ball4 = 0, ball5 = 0, ball6 = 0;


	public void setStart() {
		start = money / 1000 ;
	}
	
	public void setBall1() {
		ball1 = (int) (Math.random() * 44.9 + 1);

	}

	public void setBall2() {
		ball2 = (int) (Math.random() * 44.9 + 1);

	}

	public void setBall3() {
		ball3 = (int) (Math.random() * 44.9 + 1);

	}

	public void setBall4() {
		ball4 = (int) (Math.random() * 44.9 + 1);

	}

	public void setBall5() {
		ball5 = (int) (Math.random() * 44.9 + 1);

	}

	public void setBall6() {
		ball6 = (int) (Math.random() * 44.9 + 1);

	}


	public String toString() {
		return String.valueOf(ball1) + "ㅣ" + String.valueOf(ball2) + "ㅣ" + String.valueOf(ball3) + "ㅣ"
				+ String.valueOf(ball4) + "ㅣ" + String.valueOf(ball5) + "ㅣ" + String.valueOf(ball6) + "ㅣ\n";
	}
}
