public class CreditPaymentService {
    public int calculate(int amount, int years) {
        double ins = 9.99;
        int month = years * 12;
        double mIns = (ins * years) / month / 100.0;
        double ac = (mIns * Math.pow((1 + mIns), month)) / (Math.pow((1 + mIns), month) - 1);
        double payment = amount * ac;
        return (int) payment;
    }
}
