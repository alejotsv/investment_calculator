public class InvestmentCalculator {
    public static void main(String[] args) {
        double initial = 14_000;
        System.out.println("Initial investment: $" + initial);

        double first_change = 40;
        char first_type = '$';

        double total = change(initial, first_change, first_type);
    }

    static double change(double initial, double change, char type) {
        double result = 0;
        if (type == '%') {
            result = initial + initial*(change/100);
            if (change >= 0) {
                System.out.println("After an increase of " + change + "%");
            } else {
                System.out.println("After a decrease of " + -1*change + "%");
            }
        }

        if (type == '$') {
            result = initial + change;
            if (change >= 0) {
                System.out.println("After an increase of $" + change);
            } else {
                System.out.println("After a decrease of $" + -1*change);
            }
        }

        System.out.println("Your current investment is: $" + result);
        return result;
    }
}
