public class InvestmentCalculator {
    public static void main(String[] args) {
        double initial = 14_000;
        System.out.println("Initial investment: $" + initial);

        double first_change = 40;
        char first_type = '%';

        double total = percentageChange(initial, first_change, first_type);
    }

    static double percentageChange(double initial, double change, char type) {
        double result = 0;
        if (type == '%'){
            result = initial + initial*(change/100);
        }


        System.out.println("Current investment is: $" + result);
        return result;
    }
}
