public class Main {
    public static void main(String[] args) {
        int amount = 100; // количество денег на счету у Клиента
        int bonus; // итоговая сумма бонуса: количество бонусных рублей и сумма на счете
        boolean more1000r = true; // если пополнение более 1000 рублей,
        int add = 1100; // количество денег, которые Клиент положил на счет
        int income; // количество бонусных рублей

        bonus = amount + add + (add / 100);
        if (add > 1000) {
            bonus = amount + add + (add / 100);
        } else {
            bonus = amount + add;
        }
        income = add/100;
        if(add>1000) {
            income = add/100;
        } else {
            income = 0;
        }

        System.out.println("Клиент пополнил счет на: " + add + " рублей, бонус равен "+ income + " рублям, " +
                "итоговая сумма на счету клиента " + bonus + " рублей.");
    }
}
