package textgame;

public class Rest {

	public void doRest(CharInfo c) {
		System.out.println("휴식(잠 OR 게임)입니다.");
		System.out.println("이준오의 HP(피로)와 MENTAL(정신건강)이 회복 되었습니다.");
		c.HERO_HP = c.HERO_HP_MAX;
		c.HERO_MENTAL = c.HERO_MENTAL_MAX;
	}
}
