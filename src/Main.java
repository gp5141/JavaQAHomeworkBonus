public class Main {

    public static void main(String[] args) {
        int balance = 13300;
        int input = 1700;

        int bonus = 0;
        if (input > 1000) {
                bonus = input / 100;
        }
        //int bonus = input > 1000 ? input / 100 : 0;

        int totalAmount = balance + input + bonus;

        System.out.println("Total:" + totalAmount);
        System.out.println("Bonus: " + bonus);
    }
}