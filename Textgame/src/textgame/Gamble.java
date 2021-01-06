package textgame;

import java.util.Scanner;

public class Gamble {
	Scanner sc = new Scanner(System.in);
	public void doGamble(CharInfo c) {
		//나가기 변수지정
		boolean isExit = true;
		
		while(isExit) {
			System.out.println("회계장부 입니다.");
			System.out.println("수입 지출을 표시해주세요.(수입/지출)");
			String input = sc.next();
			if(!"수입".equals(input) &&!"지출".equals(input)) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			System.out.println("현재 소지중인 골드 : " + c.GOLD +"수입 또는 지출 금액을 입력하세요");
			//입력대기 골드
			int gold = sc.nextInt();
			if(input.equals("수입")) {
				System.out.println(input+" 내역 입니다.");
				c.GOLD += gold;
				System.out.println(c.GOLD+" 현재 잔액 입니다.");
			}
			else if(input.equals("지출")) {
				System.out.println(input+" 내역 입니다.");
				c.GOLD -= gold;
				System.out.println(c.GOLD+" 현재 잔액 입니다.");
			}
			
			System.out.println("현재 소지중인 골드 : " + c.GOLD);
			System.out.println("계속하시려면  '계속하기' 를 클릭 ");
			System.out.println("종료하시려면  '종료하기' 를 클릭 ");
			
			input = sc.next();
			if("계속하기".equals(input)) {
				isExit = true;
			}else if("종료하기".equals(input)){
				System.out.println("마을로 복귀합니다.");
				isExit = false;
			}
		}
		
	}
}
