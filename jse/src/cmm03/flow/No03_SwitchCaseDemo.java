package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int avg = 0;

		do {
			System.out.println("��� ������ �Է��ϼ���");
			avg = scanner.nextInt();
		} while (avg > 100 || avg < 0);    // do ~while�� ���͸��� ����

		String result = "";
		if (avg >= 70) {
			result = "�հ�";
		}
		if (avg >= 70) {
			result = "�հ�";
		} else {
			result = "�����";
		}
		// ��������� ���� �� ���� ���ϱ�

		char grade = 'F';
		/*
		 * if(avg>=90){grade='A';} else if(avg>=80){grade='B';} else
		 * if(avg>=70){grade='C';} else if(avg>=60){grade='D';} else{grade='F';}
		 */
		// �� if else �� Switch�� �ٲٽÿ�.

		switch (avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			break;
		}
		System.out.println("���ϴ�" + result + "�̸�," + "������ " + grade + " �Դϴ�.");
	}
}
