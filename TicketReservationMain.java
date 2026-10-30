package OPP_Project;

import java.util.*;

// Custom Exception
class SeatUnavailableException extends Exception {
    SeatUnavailableException(String msg) {
        super(msg);
    }
}

// Interface
interface ReservationManager {
    void bookSeat(int seatNo, String name) throws SeatUnavailableException;
    void cancelSeat(int seatNo) throws Exception;
    void viewReservations();
}


// Reservation Class
class Reservation {
    int seatNo;
    String attendee;

    Reservation(int s, String a) {
        seatNo = s;
        attendee = a;
    }

    public String toString() {
        return "Seat No: " + seatNo + ", Name: " + attendee;
    }
}

// Main Class implementing Interface
class TicketSystem implements ReservationManager {

    // Using List to store reservations
    List<Reservation> list = new ArrayList<>();

    // Method to check if seat exists
    private Reservation findSeat(int seatNo) {
        for (Reservation r : list) {
            if (r.seatNo == seatNo) return r;
        }
        return null;
    }

    // Book seat
    public void bookSeat(int seatNo, String name) throws SeatUnavailableException {
        if (null != findSeat(seatNo)) {
            throw new SeatUnavailableException("Seat is already booked!");
        }
        list.add(new Reservation(seatNo, name));
        System.out.println("Seat booked successfully!");
    }

    // Cancel seat
    public void cancelSeat(int seatNo) throws Exception {
        Reservation r = findSeat(seatNo);
        if (r == null) {
            throw new Exception("Reservation does not exist!");
        }
        list.remove(r);
        System.out.println("Reservation cancelled!");
    }

    // View all reservations
    public void viewReservations() {
        if (list.size() == 0) {
            System.out.println("No reservations yet.");
            return;
        }
        for (Reservation r : list) {
            System.out.println(r);
        }
    }
}

// Main Runner Class
public class TicketReservationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketSystem ts = new TicketSystem();

        while (true) {
            System.out.println("\n--- Ticket Reservation System ---");
            System.out.println("1. Book a Seat");
            System.out.println("2. Cancel a Reservation");
            System.out.println("3. View All Reservations");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = 0;
            try {
                ch = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
                continue;
            }

            switch (ch) {

                case 1:
                    try {
                        System.out.print("Enter seat number: ");
                        int seat = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        ts.bookSeat(seat, name);
                    } catch (SeatUnavailableException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Invalid data!");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter seat number to cancel: ");
                        int seat = sc.nextInt();
                        ts.cancelSeat(seat);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    ts.viewReservations();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}