package junittest;

import org.junit.Test;

import sixone.SutdaCard;
import sixsix.Exercise6_6;
import sixsix.MyPoint;
import sixthree.Student;
import sixtwenty.Excercise6_20;
import sixtwentyforth.Exercise6_24;
import sixtwentyone.MyTv;
import sixtwentythree.Excercise6_23;
import sixtwentytwo.Exercise6_22;

public class JUnitCode {

	@Test
	public void sixoneTest() {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}

	@Test
	public void sixthreeTest() {

		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());

		Student newS = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(newS.info());

	}

	@Test
	public void sixSixTest() {
		Exercise6_6 sixSix = new Exercise6_6();

		System.out.println(sixSix.getDistance(1, 1, 2, 2));// static 다시 살펴보기
															// 매소드에 static을 걸면
															// 어찌되지?
	}

	@Test
	public void sixSeven() {
		MyPoint myPoint = new MyPoint(1, 1);
		System.out.println(myPoint.getDistance(2, 2));
	}

	@Test
	public void sixTwenty() {

		Excercise6_20 ex = new Excercise6_20();

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = ex.shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

	@Test
	public void sixTwentyOne() {

		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

	}

	@Test
	public void sixTwentyTwo() {

		Exercise6_22 ex = new Exercise6_22();

		String str = "123";
		System.out.println(str + "는 숫자입니까? " + ex.isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + ex.isNumber(str));

	}

	@Test
	public void sixTwentyThree() {

		Excercise6_23 ex = new Excercise6_23();
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + ex.max(data));
		// System.out.println("최대값:" + ex.max(null)); //null 인 경우를 못잡아 내겠습니다ㅠㅠㅠ
		System.out.println("최대값:" + ex.max(new int[] {})); // 크기가 0인 배열
	}

	@Test
	public void sixTwentyForth() {

		Exercise6_24 ex = new Exercise6_24();
		
		int value = 5;
		System.out.println(value + "의 절대값:" + ex.abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + ex.abs(value));

	}

}
