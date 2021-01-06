package textgame;

import java.io.IOException;
import java.util.Scanner;

public class Monster {
	Menu menu = new Menu();
	
	//몬스터이름
	String M_name;
	//몬스터 체력
	int M_HP;
	//몬스터 최대체력
	int M_HP_MAX;
	//몬스터 마력
	int M_MP;
	//몬스터 최대마력
	int M_MP_MAX;
	//몬스터 데미지
	int M_DMG;
	//몬스터 경험치
	int M_EXP;
	
	public Monster(String monster_name) {
		if("전기 기사(1h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 1;
			this.M_HP_MAX = 1;
			this.M_DMG = 1;
			this.M_EXP = 1;
		}else if("전기 기사(2h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 2;
			this.M_HP_MAX = 2;
			this.M_DMG = 2;
			this.M_EXP = 2;
		}
		else if("전기 기사(3h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 3;
			this.M_HP_MAX = 3;
			this.M_DMG = 3;
			this.M_EXP = 3;
		}
		else if("토이ㄱ(1h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 1;
			this.M_HP_MAX = 1;
			this.M_DMG = 1;
			this.M_EXP = 1;
		}else if("토이ㄱ(2h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 2;
			this.M_HP_MAX = 2;
			this.M_DMG = 2;
			this.M_EXP = 2;
		}
		else if("토이ㄱ(3h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 3;
			this.M_HP_MAX = 3;
			this.M_DMG = 3;
			this.M_EXP = 3;
			
		}else if("자바(1h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 1;
			this.M_HP_MAX = 1;
			this.M_DMG = 1;
			this.M_EXP = 1;
		}else if("자바(2h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 2;
			this.M_HP_MAX = 2;
			this.M_DMG = 2;
			this.M_EXP = 2;
		}
		else if("자바(3h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 3;
			this.M_HP_MAX = 3;
			this.M_DMG = 3;
			this.M_EXP = 3;	
		}
		else if("운동(1h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 1;
			this.M_HP_MAX = 1;
			this.M_DMG = 1;
			this.M_EXP = 1;
		}else if("운동(2h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 2;
			this.M_HP_MAX = 2;
			this.M_DMG = 2;
			this.M_EXP = 2;
		}
		else if("운동(3h)".equals(monster_name)) {
			this.M_name = monster_name;
			this.M_HP = 3;
			this.M_HP_MAX = 3;
			this.M_DMG = 3;
			this.M_EXP = 3;
			
		}
	}
	
	//몬스터 hp보정(0이하가 되었을경우 0으로지정)
	public void setHp(Monster m) {
		if(m.M_HP < 0) {
			m.M_HP = 0;
		}
	}
	//몬스터의 반격
	public void isDied(CharInfo c, Monster m) {
		
		if(m.M_HP > 0 ) {
			c.HERO_HP -= M_DMG;
			System.out.println(m.M_name+" 이/가 반격을 가합니다.");
			System.out.println(m.M_DMG+"의 데미지를 받아습니다.");
			System.out.println("현재 캐릭터의 hp는 : " + c.HERO_HP+"/"+c.HERO_HP_MAX);
			System.out.println("************************");
		}else if(m.M_HP < 0 ) {
			System.out.println(m.M_name+" 가쓰러졌다.");
			System.out.println("************************");
		}
	}
	
	//몬스터 사냥 후 경험치 획득
	void setExp(Monster m,CharInfo c) {
		c.EXP += m.M_EXP;
		System.out.println("경험치 "+m.M_EXP + " 을 얻었습니다.");
		c.setLv(c);
	}
	
	//몬스터 전투
	void battle(CharInfo c,Monster m) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(m.M_HP > 0) {
			//메뉴 클래스에 있는 액션메뉴 호출
			menu.actionMenu();
			//입력대기상태
			String input =sc.next();
			
			if("1".equals(input)) {
				m.M_HP = m.M_HP- c.HOUR_DMG;
				System.out.println(m.M_name+"에게 "+c.HOUR_DMG+"의 데미지를 주었습니다.");
				m.setHp(m);
				System.out.println("현재 몬스터 체력 : " +m.M_HP +"/"+m.M_HP_MAX);
			}	
				//현재 스테이터스 표시
			else if("2".equals(input)) {
				System.out.println("현재스테이터스입니다.");
				c.setStatus(c);
				continue;
				//1,2,3 외 다른것을 입력했을 경우
			}else {
				System.out.println("올바른 메뉴를 입력해주세요");
				continue;
			}
			//몬스터 반격
			m.isDied(c, m);
			//유저 캐릭터 보정
			c.modeCharInfo(c);
		}
		m.setExp(m, c);
		//보유중인 아이템
		System.out.println("보유중인 아이템은 : "+c.itemBag);
		System.out.println("마을로 돌아갑니다.");
	}	
	}
