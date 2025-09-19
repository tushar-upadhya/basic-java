public class FunctionsParams {

    public static void main(String[] args) {

        int user1 = 20;

        getAgeInDay(user1);

        int amount = 1000;
        int time = 1;
        int rate = 12;
        calculateInterestRate(amount, time, rate);
    }

    public static void getAgeInDay(int parameter) {
        // System.out.println(parameter * 365);
    }

    public static void calculateInterestRate(int amount, int time, int rate) {
        System.out.println((amount * time * rate) / 100);
    }
}
