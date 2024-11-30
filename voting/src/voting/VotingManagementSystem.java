package voting;
import java.util.ArrayList;
import java.util.Scanner;

// Define classes for the project
class Voter {
    String name;
    int age;
    String contactInfo;
    String voterID;

    public Voter(String name, int age, String contactInfo, String voterID) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
        this.voterID = voterID;
    }
}

class Appointment {
    String voterName;
    String date;
    String time;

    public Appointment(String voterName, String date, String time) {
        this.voterName = voterName;
        this.date = date;
        this.time = time;
    }
}

public class VotingManagementSystem {
    static ArrayList<Voter> voters = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Voting Management System!");
        boolean exit = false;

        while (!exit) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Register New Voter");
            System.out.println("2. View Voter History");
            System.out.println("3. Schedule Voting Appointment");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    registerNewVoter();
                    break;
                case 2:
                    viewVoterHistory();
                    break;
                case 3:
                    scheduleVotingAppointment();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Voting Management System.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method for registering a new voter
    private static void registerNewVoter() {
        System.out.println("Enter Voter's Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Enter Contact Info:");
        String contactInfo = scanner.nextLine();
        System.out.println("Enter Voter ID:");
        String voterID = scanner.nextLine();

        Voter newVoter = new Voter(name, age, contactInfo, voterID);
        voters.add(newVoter);
        System.out.println("Voter registration successful!");
    }

    // Method for viewing voter history
    private static void viewVoterHistory() {
        System.out.println("Enter Voter ID to search:");
        String voterID = scanner.nextLine();

        for (Voter voter : voters) {
            if (voter.voterID.equals(voterID)) {
                System.out.println("\nVoter Details:");
                System.out.println("Name: " + voter.name);
                System.out.println("Age: " + voter.age);
                System.out.println("Contact Info: " + voter.contactInfo);
                System.out.println("Voter ID: " + voter.voterID);
                return;
            }
        }
        System.out.println("Voter not found.");
    }

    // Method for scheduling a voting appointment
    private static void scheduleVotingAppointment() {
        System.out.println("Enter Voter Name:");
        String voterName = scanner.nextLine();
        System.out.println("Enter Appointment Date (e.g., YYYY-MM-DD):");
        String date = scanner.nextLine();
        System.out.println("Enter Appointment Time (e.g., HH:MM):");
        String time = scanner.nextLine();

        Appointment newAppointment = new Appointment(voterName, date, time);
        appointments.add(newAppointment);

        System.out.println("\nAppointment Scheduled Successfully!");
        System.out.println("Summary:");
        System.out.println("Voter Name: " + voterName);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}
 
