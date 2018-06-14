package domain;

public class IPhone extends CellPhone {
	// 홍길동에게 010 번호로 애플 제품 아이폰을 사용해서 이동가능한 상태로 안녕이라고 문자를 보낸다.
	protected String data;
	public static final String BRAND = "애플", KIND = "아이폰";

	public void setData(String data) {
		this.data = data + "라고 문자했다.";
	}

	public String getData() {
		return data;
	}

	public String toString() {
		return String.format("%s에게 %s 번호로 %s 제품인 %s를 사용해서 %s 한 상태로 %s ", super.getName(),
				super.getPhoneNum(), BRAND, KIND, super.getMove() ,data);

	}
}


//package domain;
//
//public class IPhone extends CellPhone {
//    public static final String BRAND = "애플", KIND = "스마트폰";
//    protected String data;
//    
//    
//    public void setData(String data){
//        this.data = data+"라고 문자했다"; 
//    }
//        public String getData() {
//            return data; 
//        }
//    public String toString() {
//    //홍길동에게 010번호로 애플제품 아이폰을 사용해서 스마트폰이기 때문에 이동가능한 상태로
//    //안녕이라고 문자를 전송했다.
//        return String.format("%s 에게 %s 번호로 %s제품 %s를 사용해서 %s 상태여서 %s ",
//                            super.getName(),
//                            super.getPhoneNum(),BRAND,KIND,
//                            super.getMove(),data);
//    
//    
//    }
//
//}