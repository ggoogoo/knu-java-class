import java.util.Scanner;

class Print{
	public static void main(String [] args){
		int age;//���� ������ �޸� ���� Ȯ�� : ���� ����
		String name;//���ڿ��� �Է� ���� ���� String�� ���� ����
		double height; //�Ǽ��� ������ ���� Ȯ�� : �Ǽ��� ���� ����
		
		Scanner myScanner = new Scanner(System.in);//System.in = ǥ�� �Է� : Ű����
		//������, Ŭ�������� �� �ܾ� �̻��� �ռ����� ��� �ι�° �ܾ��� ù ���ڴ� �빮�ڷ�!
		
		System.out.print("���� : ");
		age = myScanner.nextInt();//�Ʊ� ���� ��ĳ�ʿ��� ���� �ϳ��� �Է¹������ �ϰ�, �װ� age�� ����!
		//nextint ���� ������ ���������� ��� but enter�� ���ۿ� �����ִ� ��
		System.out.print("Ű : ");
		height = myScanner.nextDouble();		
		myScanner.nextLine();//�ι�° ��� next�� nextLine���� - ���۸� ���� �뵵
		
		System.out.print("�̸� : ");
		name = myScanner.nextLine();/*ù��° ��� Line����� ������ ������⸦ �ϸ�(�� ����) ����� �̻��ϰ� ����(��)*///nextLine �� ���� ��°�� �о�´�.?�Է��ϱ⵵ ���� ���Ͱ� �Էµż� �Ѿ����
			

		
		System.out.println("���� : "+age);
	//	System.out.println("�̸��� "+name+"�Դϴ�.");
		System.out.printf("�̸��� %s�Դϴ�.\n", name);//f�� formatted ���������ڸ� ��밡�� - %d/ %c/ %s/ %lf 
		System.out.printf("�Է��Ͻ� Ű�� %.2f�Դϴ�. \n", height);//lf�ϸ� �ȵ�
		
		
		System.out.println("JRE: �ڹ� ���� ȯ��");
		System.out.println("JDK: �ڹ� ���� ȯ��");
	}
}
