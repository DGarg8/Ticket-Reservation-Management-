
# 🎟️ Ticket Reservation System (Java)

## 📌 About the Project

The **Ticket Reservation System** is a console-based Java application that allows users to manage ticket reservations through a simple menu-driven interface.

Users can book seats, cancel existing reservations, and view all current bookings. The project demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts in Java.

## ✨ Features

- **Book a Seat:** Reserve a seat by entering a seat number and attendee name.
- **Cancel Reservation:** Cancel an existing reservation using its seat number.
- **View Reservations:** Display all currently booked seats and attendee details.
- **Duplicate Booking Prevention:** Prevents users from booking an already reserved seat.
- **Exception Handling:** Handles invalid inputs and unavailable seats.
- **Menu-Driven Interface:** Provides an easy-to-use console interface.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Collections Framework:** ArrayList
- **Interface:** ReservationManager
- **Exception Handling:** Custom Exception and Built-in Exceptions
- **OOP Concepts:** Classes, Objects, Interfaces, Encapsulation, and Abstraction

## 📂 Project Structure

```text
Ticket-Reservation-System/
│
├── src/
│   └── OPP_Project/
│       └── TicketReservationMain.java
│
└── README.md
```

## ⚙️ How to Run the Project

### Prerequisites

- Java Development Kit (JDK) installed.
- Any Java IDE (IntelliJ IDEA, Eclipse, or VS Code) or terminal.

### Steps

1. Clone the repository:

   ```bash
   git clone <your-repository-url>
   ```

2. Navigate to the project directory.

3. Compile the Java file:

   ```bash
   javac -d . TicketReservationMain.java
   ```

4. Run the application:

   ```bash
   java OPP_Project.TicketReservationMain
   ```

## 💻 Sample Output

```text
--- Ticket Reservation System ---
1. Book a Seat
2. Cancel a Reservation
3. View All Reservations
4. Exit

Enter choice: 1
Enter seat number: 101
Enter name: Rahul
Seat booked successfully!

--- Ticket Reservation System ---
1. Book a Seat
2. Cancel a Reservation
3. View All Reservations
4. Exit

Enter choice: 3
Seat No: 101, Name: Rahul

--- Ticket Reservation System ---
1. Book a Seat
2. Cancel a Reservation
3. View All Reservations
4. Exit

Enter choice: 2
Enter seat number to cancel: 101
Reservation cancelled!
```

## 🧠 OOP Concepts Implemented

| Concept | Implementation |
|---|---|
| Class and Object | Reservation, TicketSystem |
| Interface | ReservationManager |
| Abstraction | Defining reservation operations through an interface |
| Encapsulation | Organizing reservation data and operations within classes |
| Exception Handling | Handling unavailable seats and invalid reservations |
| Collections | Using ArrayList to store reservations |

## 🚀 Future Improvements

- Add user authentication and registration.
- Introduce different ticket categories.
- Store reservations permanently using a database.
- Add ticket pricing and payment functionality.
- Develop a graphical user interface (GUI).
- Generate booking confirmation and ticket IDs.

## 👨‍💻 Author

Developed as a Java Object-Oriented Programming project.

---

⭐ If you find this project useful, feel free to star the repository!
