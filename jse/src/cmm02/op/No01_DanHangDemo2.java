package cmm02.op;

public class No01_DanHangDemo2 {
	public static void main(String[] args) {
		// �������� �������� �о�� �� �����Ѵ�.
		int i = 5;
		int j = 0;
		j = i++;
		System.out.println("j = i++ �� ���");
		System.out.println("==========");
		System.out.println("i�� �� : " + i);
		System.out.println("j�� �� : " + j);
		System.out.println();
		
		// �������� 1�� ���� ������Ű�� �����Ѵ�.
		int x = 5;
		int y = 0;
		y = ++x;
		System.out.println("y = ++x �� ���");
		System.out.println("==========");
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
	}
}