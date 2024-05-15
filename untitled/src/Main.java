public class Main{

    public static void main (String[] args){

        int moneyAnount = 150;
        int americanoCoffe = 151;
        int latte = 120;
        int capuchino = 50;
        int water = 20;

        boolean canMoneyAmount = false;

        if (moneyAnount > americanoCoffe) {
            System.out.println("Вы можете купить американо");
            canMoneyAmount = true;
        }

        if (moneyAnount > latte) {
            System.out.println("Вы можете купить латте");
            canMoneyAmount = true;
        }

        if (moneyAnount > capuchino)
        {
            System.out.println("Вы можете купить капучино");
            canMoneyAmount = true;
        }

        if (moneyAnount > water) {
            System.out.println("Вы можете купить воду");
            canMoneyAmount = true;
        }
        if (canMoneyAmount == false){

            System.out.println("У вас недостаточно денег");
        }

    }

}