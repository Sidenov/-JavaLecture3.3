public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double result1 = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж " + result1 + " рублей");

        double result2 = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж " + result2 + " рублей");

        double result3 = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж " + result3 + " рублей");

    }
}
