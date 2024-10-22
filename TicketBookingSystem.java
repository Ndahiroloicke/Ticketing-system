public class TicketBookingSystem {

    // Method to book a ticket
    public void bookTicket(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException(age);
        } else {
            System.out.println("Ticket booked successfully!");
        }
    }
}
