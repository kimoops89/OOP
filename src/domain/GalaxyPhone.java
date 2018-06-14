package domain;

public class GalaxyPhone extends IPhone {
	private String size = "6인치";
	public static final String BRAND = "삼성", KIND = "갤럭시노트";

	/* 홍길동에게 010번호로 삼성 제품 6인치 갤럭시노트폰을 사용해서 이동가능한 상태로 안녕이라고 카톡했다. data를 오버라이딩 할 것 */
	public void setData(String data) {
		super.data = data + "이라고 카톡했다.";
	}

	public String toString() {
		return String.format("%s에게 %s 번호로 %s 제품중 %s 크기인 %s를 사용해서 %s 한 상태로 %s", 
				super.getName(), 
				super.getPhoneNum(),
				BRAND, size, KIND, 
				super.getMove(), data);

	}

}
