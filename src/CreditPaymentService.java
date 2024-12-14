public class CreditPaymentService {

    public int calculate(int loanAmountInRubles, int loanTermInMonths, double theInterestRateInPercent) {

        double percentMonth = theInterestRateInPercent / 12 / 100;
        double payment = loanAmountInRubles * (( percentMonth * Math.pow((1 + percentMonth), loanTermInMonths)) /
                (Math.pow((1 + percentMonth), loanTermInMonths) - 1));
        return (int) payment;

    }
}
