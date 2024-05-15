public class Converter {
    int oneStepInCM = 75;
    int oneStepInCalories = 50;
    int caloriesInKilocalories = 1000;

    int convertToKm(int steps) {
        return (steps * oneStepInCM) / 100000;
    }

    int convertStepsToKilocalories(int steps) {
        return (steps * oneStepInCalories) / caloriesInKilocalories;
    }
}
