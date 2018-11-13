import java.util.Scanner;

class Print{
	public static void main(String [] args){
		int age;//나이 저장할 메모리 공간 확보 : 변수 선언
		String name;//문자열을 입려 받을 때는 String형 변수 선언
		double height; //실수를 저장할 공간 확보 : 실수형 변수 선언
		
		Scanner myScanner = new Scanner(System.in);//System.in = 표준 입력 : 키보드
		//변수명, 클래스명이 두 단어 이상의 합성어일 경우 두번째 단어의 첫 문자는 대문자로!
		
		System.out.print("나이 : ");
		age = myScanner.nextInt();//아까 만든 스캐너에게 정수 하나를 입력받으라고 하고, 그걸 age에 저장!
		//nextint 다음 정수를 가져가라라는 명령 but enter는 버퍼에 남아있는 중
		System.out.print("키 : ");
		height = myScanner.nextDouble();		
		myScanner.nextLine();//두번째 방법 next나 nextLine쓰기 - 버퍼를 비우는 용도
		
		System.out.print("이름 : ");
		name = myScanner.nextLine();/*첫번째 방법 Line지우기 하지만 띄워쓰기를 하면(박 지현) 결과가 이상하게 나옴(박)*///nextLine 한 줄을 통째로 읽어온다.?입력하기도 전에 엔터가 입력돼서 넘어가버림
			

		
		System.out.println("나이 : "+age);
	//	System.out.println("이름은 "+name+"입니다.");
		System.out.printf("이름은 %s입니다.\n", name);//f는 formatted 서식지정자를 사용가능 - %d/ %c/ %s/ %lf 
		System.out.printf("입력하신 키는 %.2f입니다. \n", height);//lf하면 안됨
		
		
		System.out.println("JRE: 자바 실행 환경");
		System.out.println("JDK: 자바 개발 환경");
	}
}
