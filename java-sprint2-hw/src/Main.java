import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            String cmd = scanner.next();
            switch (cmd) {
                case "1" -> stepTracker.addNewNumberStepsPerDay();
                case "2" -> stepTracker.changeStepGoal();
                case "3" -> {
                    stepTracker.printStatistic();
                    System.out.print("Введите номер месяца: ");
                    int monthNumber = scanner.nextInt();
                    MonthData.averageStep(stepTracker.monthToData, monthNumber, stepTracker.converter, stepTracker.goalByStepsPerDay);
                }
                case "4" -> {
                    System.out.println("Завершение работы программы.");
                    return;
                }
                default -> System.out.println("Такой команды нет.");
            }
        }


    }
    static void printMenu() {
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("4 - Выйти из приложения");
    }
}
