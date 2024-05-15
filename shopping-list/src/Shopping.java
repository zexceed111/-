import java.util.Scanner;
public class Shopping{
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];

        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");
            System.out.print("Ваш выбор: ");

            int actionNumber = scanner.nextInt();



            switch (actionNumber) {

                case 1:
                    if (productCount < 8) {

                        System.out.println("Введите товар который хотите добавить: ");
                        String productName = scanner.next();
                        shoppingList[productCount] = productName;
                        productCount++;
                        System.out.println("Товар успешно добавлен в список!");
                    }else {
                        System.out.println("Список полон. Нельзя добавить больше товаров.");
                    }
                    break;

                case 2:
                    if (productCount == 0){
                        System.out.println("Ваш список пуст");
                    }else {
                        for (int i = 0; i < productCount; i++){
                            System.out.println((i + 1) + ". " + shoppingList[i]);
                        }
                    }
                    break;

                case 3:

                    productCount = 0;
                    System.out.println("Вы очистели свой список.");
                    break;

                case 4:

                    System.out.println("Работа со списком завершина");
                    System.exit(0);
                    break;

                default:
                    if (actionNumber != 4){
                        System.out.println("Такой команды нет!");
                    }

            }
        }
    }
}