public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000;
        int years = 3;
        double percent = 9.99;
        double result = service.calculate(creditAmount, years, percent);
        System.out.println("Ежемесячный платеж " + result);
        System.out.println("Процентная ставка " + percent);
    }
}
