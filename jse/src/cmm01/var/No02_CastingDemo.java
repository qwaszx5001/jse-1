package cmm01.var;

public class No02_CastingDemo {
	public static void main(String[] args) {
/*
 Up-Casting 
 = ��ȯ(Conversion)
 = promotion
 = ������ ��ȯ(Implict) �ڵ���ȯ
  : �ڹٰ� �����ϴ� �ڵ���ȯ���� �������� ����
  ������ Ÿ���� ǥ�������� �����ʿ��� ���������� ��ȯ �ɶ��� �����ϴ�.
 */
			byte varByte = 1;
			int varInt = 123;
			double varDouble = 123.456;
			int upByte = varByte;
			double upInt = varInt;

/*
 Down-Casting 
= ĳ����(Casting)
���� ����ȯ
: ���α׷����� ��������� �����ϴ� Ÿ�Ժ�ȯ.
��Һ�ȯ�� �Ǵ� ���� �ݵ�� ��������� ĳ�����Ͽ��� ��.
���� !! ������ �ս��� �߻��� �� �ִ�.
 */

			float varflo = 123.456F;
			int downflo =  (int) varflo;
			System.out.println("�ٿ�ĳ���� ����� :  "+downflo);
	}	
}
