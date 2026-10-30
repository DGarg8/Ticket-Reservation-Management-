# 🎟️ Ticket Reservation System (Java)

## 📌 About the Project

The **Ticket Reservation System** is a console-based Java application developed as part of the Semester 3 Object-Oriented Programming (OOP) coursework.

The application allows users to book seats, cancel existing reservations, and view all current bookings through a simple menu-driven interface.

This project demonstrates the practical implementation of Java OOP concepts, interfaces, collections, and exception handling.

## ✨ Features

- **Book a Seat:** Reserve a seat by entering a seat number and attendee name.
- **Cancel Reservation:** Cancel an existing reservation using its seat number.
- **View Reservations:** Display all currently booked seats and attendee details.
- **Duplicate Booking Prevention:** Prevents users from booking an already reserved seat.
- **Exception Handling:** Handles unavailable seats and invalid inputs.
- **Menu-Driven Interface:** Provides a simple console-based user experience.

## 🛠️ Technologies & Concepts Used

- **Programming Language:** Java
- **Collections Framework:** ArrayList
- **Interface:** ReservationManager
- **Custom Exception:** SeatUnavailableException
- **Exception Handling:** Built-in and custom exceptions
- **OOP Concepts:** Classes, Objects, Abstraction, and Interfaces

## 📂 Project Structure

```text
Ticket-Reservation-System-Java/
│
├── src/
│   └── OPP_Project/
│       └── TicketReservationMain.java
│
└── README.md
```

### Prerequisites

- Java Development Kit (JDK) installed.
- Any Java IDE or terminal.


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
| Classes and Objects | Reservation, TicketSystem |
| Interface | ReservationManager |
| Abstraction | Defining reservation operations through an interface |
| Collections | ArrayList for storing reservations |
| Exception Handling | Handling unavailable seats and invalid reservations |

## 🚀 Future Improvements

- Add user registration and authentication.
- Introduce different ticket categories.
- Integrate a database for permanent reservation storage.
- Add ticket pricing and payment functionality.
- Develop a graphical user interface (GUI).
- Generate booking confirmation and ticket IDs.

## 🎓 Academic Information

- **Project:** Ticket Reservation System
- **Semester:** 3
- **Subject:** Object-Oriented Programming
- **Language:** Java
- **Project Type:** Academic Mini Project

## 👨‍💻 Author

Developed as part of Semester 3 academic coursework to understand and implement Object-Oriented Programming concepts using Java.

---

⭐ If you find this project useful, feel free to star the repository!
