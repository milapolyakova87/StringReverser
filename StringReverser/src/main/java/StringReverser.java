import java.util.Scanner;

public class StringReverser {

    // Метод для реверсирования строки без пробелов
    public static String reverseStringWithoutSpaces(String input) {
        // Убираем все пробелы из строки
        String noSpaces = input.replaceAll("\\s", "");

        // Преобразуем строку в массив символов
        char[] characters = noSpaces.toCharArray();

        // Реверсируем массив символов
        for (int i = 0; i < characters.length / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[characters.length - 1 - i];
            characters[characters.length - 1 - i] = temp;
        }

        // Возвращаем строку из реверсированного массива символов
        return new String(characters);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем строку у пользователя
        System.out.println("Введи строку:");
        String input = scanner.nextLine();

        // Вызываем метод для реверсирования строки
        String reversed = reverseStringWithoutSpaces(input);

        // Выводим результат
        System.out.println("Исходная строка: " + input);
        System.out.println("Реверсированная строка без пробелов: " + reversed);

        scanner.close();
    }
}
