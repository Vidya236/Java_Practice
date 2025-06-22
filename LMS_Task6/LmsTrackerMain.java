package LMS_Task6;

import java.util.Scanner;

public class LmsTrackerMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        student student = new student();
        System.out.println("Student Id: ");
        student.sid = sc.nextInt();
        System.out.println("Student Name: ");
        student.sname = sc.next();

        student.displayStudentDetails();
        System.out.println(student.sessionsAttendedCredits());
        System.out.println(student.performanceCredits(90));
        System.out.println(student.achievementStatus());
        Trainer t1 = new Trainer();
        t1.trainerID = 101;
        t1.trainerName = "John";

        t1.trainerInfo();
        // s1.trainerRatings();

        // System.out.println(t1.trainerPaymentCal());
        System.out.println(t1.totalPaymentForTrainer());

    }

}
