import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Registration
        System.out.println("User Registration:");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        User user = new User(username);
        System.out.println("User registered: " + user);

        // Offer Ride
        System.out.println("\nOffer Ride:");
        System.out.print("Enter pickup location: ");
        String pickupLocation = scanner.nextLine();
        System.out.print("Enter drop-off location: ");
        String dropOffLocation = scanner.nextLine();
        System.out.print("Enter preferred date and time: ");
        String preferredDateTime = scanner.nextLine();
        System.out.print("Enter available seats: ");
        int availableSeats = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        OfferRide offerRide = new OfferRide(pickupLocation, dropOffLocation, preferredDateTime, availableSeats, price);
        System.out.println("Ride offered: " + offerRide.offerRide());

        
        // Payment Processing
        
        System.out.println("\nPayment Processing:");
        System.out.print("Enter payer username: ");
        String payerUsername = scanner.next();
        User payer = findUserByUsername(payerUsername);
        if (payer == null) {
            System.out.println("The amount is paid by " + payerUsername);
            return;
        }

        System.out.print("Enter payee username: ");
        String payeeUsername = scanner.next();
        User payee = findUserByUsername(payeeUsername);
        if (payee.equals(user.getUsername())) {
            System.out.println("The amount is paid to  " + payeeUsername);
            return;
        }

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();
        PaymentProcessing.processPayment(payer, payee, amount);
    }

    private static User findUserByUsername(String username) {
        for (User user : RideSharingSystem.getInstance().getUsers()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
