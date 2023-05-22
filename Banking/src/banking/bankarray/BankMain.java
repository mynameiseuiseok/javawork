package banking.bankarray;

import java.util.Scanner;

public class BankMain {
	// 통장 계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];
	static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1. 계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			// 메뉴 선택 변수
			int selectNo = Integer.parseInt(scanner.nextLine());	// 숫자형으로 변환
			
			if(selectNo == 1) {
				createAccount(); // 계좌 생성
			}else if(selectNo == 2) {
				getAccountList(); // 계좌 목록
			}else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}
		}	// while() 끝
		
	}	// main() 끝
	
	// 계좌를 생성하는 함수
	private static void createAccount() {
		System.out.println("--------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("--------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		// 첫번째 계좌 생성
		// accountArray[0] = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) { // 전체 배열을 반복하면서
			// 0번 인덱스가 새 계좌가 저장되는 문제
			if(accountArray[i] == null) { // 계좌가 저장되지 않는 인덱스에
				accountArray[i] = new Account(ano, owner, balance); // 계좌를 생성함
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	
	// 계좌 목록을 출력하는 메서드
	private static void getAccountList() {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {	// 배열의 요소가 null이 아닌 경우(계좌가 있음)
				System.out.print("계좌번호: " + accountArray[i].getAno() + "\t");
				System.out.print("계좌주: " + accountArray[i].getOwner() + "\t");
				System.out.println("잔액: " + accountArray[i].getBalance());
			}
		}
	}
} // Main 클래스 끝