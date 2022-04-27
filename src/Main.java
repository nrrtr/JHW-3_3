public class Main {
    public static void main(String[] args) {
        CreditPaymentService cps = new CreditPaymentService();

        System.out.println(cps.calculate(1_000_000, 1));

        System.out.println(cps.calculate(1_000_000, 2));

        System.out.println(cps.calculate(1_000_000, 3));
    }
}
