import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Первое число из консоли
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        // Второе число из консоли
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        // Заранее введенные данные
        //int firstNumber =5;
        //int secondNumber = 10;

        //Вычисляем
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        //Выводим результат
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.printf("Частное: %.2f\n", quotient);
    }
}
