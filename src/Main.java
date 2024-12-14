//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int loanAmountInRubles = 1_000_000;
        int loanTermInMonths = 12;
        double theInterestRateInPercent = 9.99;
        int monthlyPayment = service.calculate(loanAmountInRubles, loanTermInMonths, theInterestRateInPercent);

        System.out.println("Ежемесячный платеж кредита сроком на 1 год:");
        System.out.println(service.calculate(1_000_000, 12, 9.99) + " рублей");

        System.out.println("Ежемесячный платеж кредита сроком на 2 года:");
        System.out.println(service.calculate(1_000_000, 24, 9.99) + " рублей");

        System.out.println("Ежемесячный платеж кредита сроком на 3 года:");
        System.out.println(service.calculate(1_000_000, 36, 9.99) + " рублей");
    }

}