public class Main {

    public static void main(String[] args) {

        AttendanceTracker at = new AttendanceTracker();

        at.markAttendance("Java", "Amit");
        at.markAttendance("Java", "Riya");
        at.markAttendance("Java", "Amit");

        at.markAttendance("Python", "Rahul");
        at.markAttendance("Python", "Rohan");

        at.displayAttendance();
    }
}