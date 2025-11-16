public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int depositAmount = 1400;
        int bonusThreshold = 1000;
        int bonusStep = 100;
        int bonusRate = 1;
        int bonusAmount = 0;

        if (depositAmount > bonusThreshold) {
            bonusAmount = depositAmount / bonusStep;
        }
        int finalBalance = initialBalance + depositAmount + bonusAmount;
        System.out.println("Начальный счёт: " + initialBalance + " руб.");
        System.out.println("Сумма пополнения: " + depositAmount + " руб.");
        System.out.println("Начислено бонусов: " + bonusAmount + " руб.");
        System.out.println("Итоговая сумма на счёте: " + finalBalance + " руб.");
    }
}
