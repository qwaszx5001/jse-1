package cmm01.var;
/*
  ������ �ۼ� ��Ģ
  1.  ���ĺ� ��ҹ���, ����, _(UnderScore), $ �� ��밡��
  2. ù ���ڰ� �����̸� �ȵ�
  3. Ű����(�����)�� ������ �ȵ�
  
 */
class No01_VarDemo{
	// ������, 1����Ʈ, �ʱⰪ : false
	boolean result = true;
	
	// ������, 2����Ʈ, �ʱⰪ : \u0000
	char capital = 'C';
	
	//������
	byte varByte = 100; // 8��Ʈ, -128 ~ 127
	short varShort = 10000; //16��Ʈ, �ʱⰪ 0
	int varInt = 1000000; //32��Ʈ, �ʱⰪ 0
	long varLong = 100L; //64��Ʈ, �ʱⰪ 0
	
	// �ε��Ҽ��� Ÿ��
	float varFloat = 100.0f; // 32��Ʈ
	double varDouble = 100.00d; //64��Ʈ
}