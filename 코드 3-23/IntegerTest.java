class IntegerTest{
	public static void main(String [] args){
		int a = 14, b = 8, c = -17;
		
		/*float f = 3.14;//���� �߻� : 3.14(�⺻ Ÿ���� double�� ����)*/
		//float�� ������ �ڷ� �ս� �߻��ϱ� ����
		//float f = (float)3.14; //�ذ� ��� 1: casting(�ڷ���)
		//�ذ� ��� 2: ���̻� ���̱�
		float f = 3.14F;
		double d = 3.14f; //floatŸ���� doubleŸ���� ������ ������ �ڷ� �ս��� �Ͼ�� �ʾƼ� ���� �� �ɸ�
		
		System.out.format("%5.2f\n", f);//5ĭȮ�� �Ҽ����Ʒ� 2ĭ, �Ҽ��� �� 2ĭ
		
		//a�� ���� ��� : 10����(decimal), 8����(octal), 16����(hexadeciaml)
		
		System.out.printf("' %-5d %-10o %X '\n  ", a, a, a);
		System.out.printf("%d %1$#o %1$#x \n", a); // a, a, a�� ���� �ʰ� ��� �ϱ� ���ؼ� %1$����Ÿ�� #�� �� �������� ǥ��
		//�빮�ڷ� ���� �ʹٸ� x��ſ� X
		
		//a, b, c�� ���
		System.out.printf("%5d\t%5d\t%5d\n", a, b, c); // %���� ������ : ���ڸ�ŭ ���� Ȯ��
		// \t�� �Ǹ�ŭ ����
		System.out.format("%5d\t%5d\t%5d\n", a, b, c); //printf() �� ���� format�� stringŬ�������� ��밡��
		System.out.format("%+5d\t%+5d\t%+5d\n", a, b, c); //+: ��ȣǥ��
		System.out.format("%-5d\t%-5d\t%-5d\n", a, b, c); //-: ���� ����
		System.out.format("%-+5d\t%-+5d\t%-+5d\n", a, b, c); // ���� ���Ŀ� ��ȣ, ������ ��� ����
		
	}
}