public class MonthData {

    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        return sum;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries++;
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
    public static void averageStep(MonthData[] monthToData, int monthNumber, Converter converter, int goalByStepsPerDay) {
        MonthData monthData = monthToData[monthNumber - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        int maxSteps = monthData.maxSteps();
        int averageSteps = sumSteps / monthData.days.length;
        int distanceInKM = converter.convertToKm(sumSteps);
        int kilocaloriesBurned = converter.convertStepsToKilocalories(sumSteps);
        int bestSeries = monthData.bestSeries(goalByStepsPerDay);

        System.out.println("Общая статистика по дням: ");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Сумма шагов за месяц: " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов за месяц: " + maxSteps);
        System.out.println("Среднее пройденное количество шагов за месяц: " + averageSteps);
        System.out.println("Пройденное за месяц дистанция в километрах: " + distanceInKM);
        System.out.println("Количество сожжённых килокалорий за месяц: " + kilocaloriesBurned);
        System.out.println("Лучшая серия: " + bestSeries);
        System.out.println();
    }


}
