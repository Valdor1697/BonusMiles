public class Main {
    public static void main(String[] args) {

        int ticket = 60_000; // Стоимость билета в рублях
        int mile = 20; // Стоимость одной мили в рублях

        int bonus = ticket / mile; // Колличество бонусов

        System.out.println("Колличество начисленных миль за купленный билет: " + bonus);

    }

}
