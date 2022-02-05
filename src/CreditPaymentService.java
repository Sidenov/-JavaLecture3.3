public class CreditPaymentService {
    public double calculate(int creditAmount, int years, double percent) {
        double i = percent / 12 / 100;      // Месячная процентная ставка
        double n = Math.pow(1 + i, years * 12);
        double k = i * n / (n - 1);        // Коэффициент аннуитета
        double payment = k * creditAmount;
        return payment;
    }
}
