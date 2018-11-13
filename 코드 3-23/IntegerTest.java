class IntegerTest{
	public static void main(String [] args){
		int a = 14, b = 8, c = -17;
		
		/*float f = 3.14;//에러 발생 : 3.14(기본 타입인 double로 간주)*/
		//float에 넣으면 자료 손실 발생하기 때문
		//float f = (float)3.14; //해결 방법 1: casting(자료형)
		//해결 방법 2: 접미사 붙이기
		float f = 3.14F;
		double d = 3.14f; //float타입을 double타입의 변수에 넣으면 자료 손실이 일어나지 않아서 오류 안 걸림
		
		System.out.format("%5.2f\n", f);//5칸확보 소숫점아래 2칸, 소숫점 위 2칸
		
		//a를 세번 출력 : 10진수(decimal), 8진수(octal), 16진수(hexadeciaml)
		
		System.out.printf("' %-5d %-10o %X '\n  ", a, a, a);
		System.out.printf("%d %1$#o %1$#x \n", a); // a, a, a를 쓰지 않고 사용 하기 위해선 %1$변수타입 #은 몇 진수인지 표시
		//대문자로 적고 싶다면 x대신에 X
		
		//a, b, c를 출력
		System.out.printf("%5d\t%5d\t%5d\n", a, b, c); // %숫자 변수형 : 숫자만큼 간격 확보
		// \t는 탭만큼 띄우기
		System.out.format("%5d\t%5d\t%5d\n", a, b, c); //printf() 와 동일 format은 string클래스에서 사용가능
		System.out.format("%+5d\t%+5d\t%+5d\n", a, b, c); //+: 부호표시
		System.out.format("%-5d\t%-5d\t%-5d\n", a, b, c); //-: 왼쪽 정렬
		System.out.format("%-+5d\t%-+5d\t%-+5d\n", a, b, c); // 왼쪽 정렬에 부호, 순서는 상관 없다
		
	}
}