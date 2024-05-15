import java.util.Scanner;

public class LAV {
    public static void main(String[] args) {
        String[] currencies = {"USD", "EUR", "JPY", "RUB"}; // Массив валют

        Scanner scanner = new Scanner(System.in);
        System.out.println("Покупка иен недоступна. Выберите другую валюту и введите её буквенный код:");

        String userCurrency = scanner.next(); // Даём пользователю возможность ввести валюту
        currencies[2] = userCurrency; // Присваиваем ввод пользователя элементу c индексом 2

        System.out.println("Спасибо! Эта валюта в наличии.");
        System.out.println("Мы заменили в вашем портфеле JPY на: " + currencies[2]);


    }
}
