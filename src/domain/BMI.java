package domain;

public class BMI {
	String name, result;
	double hei, wei;

	public void setName(String name) {
		this.name = name; /* 만약 변수 명이 다를 경우는 앞에 this를 생략하고 다른 변수명을 써줄수 있다. */
	}

	public void setResult() {
		double body = (wei / (hei * hei)) * 10000;
		if (body <= 18.5) {
			result = "저체중";

		} else if (18.5 < body && body <= 23.0) {
			result = "정상";

		} else if (23.0 < body && body <= 25.0) {
			result = "과체중";

		} else if (25.0 < body && body <= 30.0) {
			result = "경도비만";

		} else if (30.0 < body && body <= 35.0) {
			result = "중등도비만";

		} else {
			result = "고도비만";
		}
	}

	public void setHei(double hei) {
		this.hei = hei;
	}

	public void setWei(double wei) {
		this.wei = wei;
	}

	public String getName() {
		return name; /* this.name으로 사용할수 있으나 this. 생략가능 */
	}

	public String getResult() {
		return result;
	}

	public double getHei() {
		return hei;
	}

	public double getWei() {
		return wei;
	}
	public String toString() {
		return String.format("%s ㅣ %f ㅣ %f ㅣ %s", name,hei,wei,result);
	}
}
