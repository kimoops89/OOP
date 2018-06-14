package domain;

public class Phone {
	private String name, phonenum, call;

	public static final String BRAND = "삼성", KIND = "집전화기";

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(String phonenum) {
		this.phonenum = phonenum;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNum() {
		return phonenum;
	}

	public String getCall() {
		return call;
	}

	public String toString() {
		return String.format("%s 에게 %s 번호로 %s 제품 전화기를 사용해서 %s로  %s 했다.", name, phonenum, BRAND, KIND, call);
		// 홍길동 , 010-1234-5678 , 삼성 , 집전화기 , 2시에만나
	}
}
