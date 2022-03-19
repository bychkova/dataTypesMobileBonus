public class Main {
    public static void main(String[] args) {
        int currentMoney = 100;
        int newMoney = 2445;
        int moneyAmount = 0;
        int bonusAmount = 0;

        if (newMoney >= 1000) {
            bonusAmount = newMoney / 100;
        }
        moneyAmount = currentMoney + newMoney + bonusAmount;
        System.out.println("Ваш баланс: " + moneyAmount + " рублей, из них бонусов - " + bonusAmount + " рублей");
    }
}