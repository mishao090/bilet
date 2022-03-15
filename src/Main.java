public class Main {
    public static void main(String[] args) {

        int price = 1000; // Стоимость билета

        int rub = 20; //

        int mile = price / rub;

        if (price < 20) {
            mile = 1;
        }

        System.out.println("миль с покупки: " + mile);
    }
}