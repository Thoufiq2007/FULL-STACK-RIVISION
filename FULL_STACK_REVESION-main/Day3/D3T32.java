package Day3;
import java.util.Scanner;
class AppointmentBooking {
    String patientName = "Rahul";
    int age = 25; 
    String appointmentTime = "10:30 AM";
    String[] availableSlots = {"09:00 AM", "10:30 AM", "12:00 PM"};
}
public class D3T32 {
    public static void main(String[] args) {
        AppointmentBooking obj = new AppointmentBooking();
        Scanner sc = new Scanner(System.in);
        try {
            if (obj.patientName == null) {
                throw new NullPointerException("Patient name cannot be null");
            }
            System.out.println("Patient Name: " + obj.patientName);
            System.out.println("Name Length: " + obj.patientName.length());
        } catch (NullPointerException e) {
            System.out.println("Not a valid string: " + e);
            sc.close();
            return;
        }
        try {
            if (obj.age <= 0) {
                throw new IllegalArgumentException("Age should be greater than zero");
            }
            System.out.println("Patient Age: " + obj.age);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            sc.close();
            return;
        }
        System.out.println("Enter an appointment slot position:");
        int num = sc.nextInt();
        try {
            System.out.println("Selected appointment slot: " + obj.availableSlots[num]);
            System.out.println("Appointment Booked Successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Appointment Booking Process Completed");
        }
        sc.close();
    }
}