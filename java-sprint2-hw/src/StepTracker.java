import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter = new Converter();
    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.print("Введите номер месяца от 1 до 12 (включительно): ");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println(monthNumber + " - некорректный ввод.");
            return;
        }
        System.out.print("Введите день от 1 до 30 (включительно): ");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println(day + " - некорректный ввод.");
            return;
        }
        System.out.print("Введите количество шагов: ");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("Вы ввели отрицательное количество шагов.");
            return;
        }

        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.print("Введите новую цель по количеству шагов: ");
        int changeStepGoal = scanner.nextInt();
        if (changeStepGoal <= 0) {
            System.out.println("Вы ввели отрицательное значение или 0");
            return;
        }
        goalByStepsPerDay = changeStepGoal;
        System.out.println("Новая цель по количеству шагов - " + goalByStepsPerDay);
    }

    void printStatistic() {
        System.out.print("Введите число месяца: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println(monthNumber + " - некорректный ввод.");
        }

    }

}
