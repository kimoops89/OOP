package domain;

public class Grade {
	String name, result;
	int kor, eng, math, total, avg;

	public void setName(String name) {
		this.name = name; /* 만약 변수 명이 다를 경우는 앞에 this를 생략하고 다른 변수명을 써줄수 있다. */
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTotal() {
		this.total = kor + eng + math;
	}

	public void setAvg() {
		this.avg =  total / 3 ;
	}

	public String getName() {
		return name; /* this.name으로 사용할수 있으나 this. 생략가능 */
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		
		return total;
	}

	public int getAvg() {
		return avg;
	}
	public String toString() {
		return result = name + "ㅣ" + kor+ "ㅣ" + eng + "ㅣ" + math + "ㅣ" + avg + "ㅣ" + total ;
	}
}
