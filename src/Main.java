public class Main {
    public static void main(String[] args) {

        int ticketCost = 13676; // стоимость билета
        int milesPerRub = 20; // количество рублей для одной бонусной мили

        int miles = (int) (ticketCost / milesPerRub); // рассчитываем количество бонусных миль
        System.out.println("Количество бонусных миль: " + miles); // выводим на экран

    }
}