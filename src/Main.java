public class Main {
    public static void main(String[] args) {

        int ticket = 6000;// стоимость билета
        int bonus = 20;// количество рублей для одной бонусной милли
        int mile = ticket / bonus; // новую переменную
        System.out.println(" На один билет начисленно:");
        System.out.println((mile) + " Бонусных миль");
    }
}
