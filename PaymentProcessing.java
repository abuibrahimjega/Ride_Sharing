public class PaymentProcessing {
    public static void processPayment(User payer, User payee, double amount) {
        if (isValidPayment(amount)) {
            if (deductAmountFromBalance(payer, amount)) {
                addAmountToBalance(payee, amount);
                System.out.println(payer.getUsername() + " paid " + amount + " to " + payee.getUsername());
            } else {
                System.out.println("Payment failed. Insufficient funds for " + payer.getUsername());
            }
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    private static boolean isValidPayment(double amount) {
        return amount > 0;
    }

    private static boolean deductAmountFromBalance(User user, double amount) {
        if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            return true;
        }
        return false;
    }

    private static void addAmountToBalance(User user, double amount) {
        user.setBalance(user.getBalance() + amount);
    }
}
