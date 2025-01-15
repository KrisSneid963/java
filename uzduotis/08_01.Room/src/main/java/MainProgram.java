import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  room details
        System.out.println("Enter the room code: ");
        String roomCode = scanner.nextLine();

        System.out.println("Enter the number of seats: ");
        int numberOfSeats = scanner.nextInt();

        // Create a Room constructor
        Room room = new Room(roomCode, numberOfSeats);

        // Room details
        System.out.println("Room Code: " + room.getCode());
        System.out.println("Number of Seats: " + room.getSeats());
    }
}



