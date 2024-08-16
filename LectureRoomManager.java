
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author Racheal Lubangakene
 */
public class LectureRoomManager {
    private final String name;
    private boolean isOpen;
    private int students;
    private final boolean[] lights; // Assume 3 lights
    private boolean projectorOn;

    public LectureRoomManager(String name) {
        this.name = name;
        this.isOpen = false;
        this.students = 0;
        this.lights = new boolean[3]; // 3 lights initialized to off (false)
        this.projectorOn = false;
    }

    public String openRoom() {
        if (!isOpen) {
            isOpen = true;
            return name + " is now open.";
        }
        return name + " is already open.";
    }

    public String closeRoom() {
        if (isOpen) {
            isOpen = false;
            return name + " is now closed.";
        }
        return name + " is already closed.";
    }

    public String addStudents(int number) {
        if (number > 0) {
            students += number;
            return "Added " + number + " students. Total students: " + students + ".";
        }
        return "Invalid number of students.";
    }

    public String removeStudents(int number) {
        if (number > 0) {
            if (number <= students) {
                students -= number;
            } else {
                students = 0;
            }
            return "Removed " + number + " students. Total students: " + students + ".";
        }
        return "Invalid number of students.";
    }

    public String turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            if (!lights[lightNumber - 1]) {
                lights[lightNumber - 1] = true;
                return "Light " + lightNumber + " is now on.";
            }
            return "Light " + lightNumber + " is already on.";
        }
        return "Invalid light number. Please choose 1, 2, or 3.";
    }

    public String turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            if (lights[lightNumber - 1]) {
                lights[lightNumber - 1] = false;
                return "Light " + lightNumber + " is now off.";
            }
            return "Light " + lightNumber + " is already off.";
        }
        return "Invalid light number. Please choose 1, 2, or 3.";
    }

    public String turnOnProjector() {
        if (!projectorOn) {
            projectorOn = true;
            return "Projector is now on.";
        }
        return "Projector is already on.";
    }

    public String turnOffProjector() {
        if (projectorOn) {
            projectorOn = false;
            return "Projector is now off.";
        }
        return "Projector is already off.";
    }

    public String roomStatus() {
        StringBuilder status = new StringBuilder("Room: " + name + "\n");
        status.append("Status: ").append(isOpen ? "Open" : "Closed").append("\n");
        status.append("Students: ").append(students).append("\n");
        for (int i = 0; i < lights.length; i++) {
            status.append("Light ").append(i + 1).append(": ").append(lights[i] ? "On" : "Off").append("\n");
        }
        status.append("Projector: ").append(projectorOn ? "On" : "Off");
        return status.toString();
    }

    public static void main(String[] args) {
        LectureRoomManager lectureRoom = new LectureRoomManager("Market Plaza Lecture Room");
        try (Scanner scanner = new Scanner(System.in)) {
            OUTER:
            while (true) {
                System.out.println("\nMain Menu:");
                System.out.println("W. Add Students");
                System.out.println("X. Remove Students");
                System.out.println("Y. Turn on Light");
                System.out.println("Z. Turn off Light");
                System.out.println("Q. Quit");
                System.out.println("1. Open Lecture Room");
                System.out.println("2. Close Lecture Room");
                System.out.println("3. Turn on Projector");
                System.out.println("4. Turn off Projector");
                System.out.println("5. Check Room Status");
                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine().toUpperCase();
                switch (choice) {
                    case "W" -> {
                        System.out.print("Enter number of students to add: ");
                        int addStudents = scanner.nextInt();
                        scanner.nextLine(); // consume the newline
                        System.out.println(lectureRoom.addStudents(addStudents));
                    }
                    case "X" -> {
                        System.out.print("Enter number of students to remove: ");
                        int removeStudents = scanner.nextInt();
                        scanner.nextLine(); // consume the newline
                        System.out.println(lectureRoom.removeStudents(removeStudents));
                    }
                    case "Y" -> {
                        System.out.print("Enter light number to turn on (1-3): ");
                        int lightOn = scanner.nextInt();
                        scanner.nextLine(); // consume the newline
                        System.out.println(lectureRoom.turnOnLight(lightOn));
                    }
                    case "Z" -> {
                        System.out.print("Enter light number to turn off (1-3): ");
                        int lightOff = scanner.nextInt();
                        scanner.nextLine(); // consume the newline
                        System.out.println(lectureRoom.turnOffLight(lightOff));
                    }
                    case "Q" -> {
                        System.out.println("Exiting the program...");
                        break OUTER;
                    }
                    case "1" -> System.out.println(lectureRoom.openRoom());
                    case "2" -> System.out.println(lectureRoom.closeRoom());
                    case "3" -> System.out.println(lectureRoom.turnOnProjector());
                    case "4" -> System.out.println(lectureRoom.turnOffProjector());
                    case "5" -> System.out.println(lectureRoom.roomStatus());
                    default -> System.out.println("Invalid choice, please try again.");
                }
            }
        }
    }
}

    

