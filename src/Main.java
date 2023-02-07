public class Main {
    public static void main(String[] args) {

        int accountMoney = 210; // Начальная сумма на счету
        int addingMoney = 150; // Сумма пополнения
        int bonus = addingMoney / 100; // Бонусные рубли

        if (addingMoney > 100) {
            int totalAmount = accountMoney + addingMoney + bonus;
            System.out.println("Клиент пополнил счёт на " + addingMoney + " рублей — бонус равен " + bonus + " рублям(ей), итоговая сумма на счету клиента — " + totalAmount + " рублей.");
        } else {
            int totalAmount = accountMoney + addingMoney;
            System.out.println("Клиент пополнил счёт на " + addingMoney + " рублей, итоговая сумма на счету клиента — " + totalAmount + " рублей.");

        }

    }
}
