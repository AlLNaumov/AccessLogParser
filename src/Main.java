import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int validFileCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите путь к файлу (или 'exit' для выхода):");
            String path = scanner.nextLine();


            if (path.equalsIgnoreCase("exit")) {
                break;
            }

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Файл не существует или указанный путь является директорией. Попробуйте снова.");
                continue;
            }

            validFileCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + validFileCount);
        }

        scanner.close();
    }
}
