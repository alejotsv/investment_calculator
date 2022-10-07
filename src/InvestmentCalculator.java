public class InvestmentCalculator {
    public static void main(String[] args) {
        double initial = 14_000;
        System.out.println("Initial investment: $" + initial);
        double first_change = 40;
        char first_type = '%';

        percentageChange(initial, first_change, first_type);
    }

    static void percentageChange(double initial, double change, char type) {
        System.out.println("I'm calling this method");
    }
}
