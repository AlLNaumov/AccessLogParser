import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ������ ����� �� �������
        System.out.println("������� ������ �����:");
        int firstNumber = new Scanner(System.in).nextInt();
        // ������ ����� �� �������
        System.out.println("������� ������ �����:");
        int secondNumber = new Scanner(System.in).nextInt();

        // ������� ��������� ������
        //int firstNumber =5;
        //int secondNumber = 10;

        //���������
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        //������� ���������
        System.out.println("�����: " + sum);
        System.out.println("��������: " + difference);
        System.out.println("������������: " + product);
        System.out.printf("�������: %.2f\n", quotient);
    }
}
