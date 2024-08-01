import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int validFileCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("������� ���� � ����� (��� 'exit' ��� ������):");
            String path = scanner.nextLine();

            if (path.equalsIgnoreCase("exit")) {
                break;
            }

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("���� �� ���������� ��� ��������� ���� �������� �����������. ���������� �����.");
                continue;
            }

            validFileCount++;
            System.out.println("���� ������ �����.");
            System.out.println("��� ���� ����� " + validFileCount);
        }

        scanner.close();
    }
}