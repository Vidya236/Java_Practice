package LMS_Task6;

import java.util.Scanner;

public class student {
    int sid;
    String sname;
    int attendanceCredits;
    int performanceScores;
    int finalCredits;
    int trainerRatings;

    public void displayStudentDetails() {
        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + sname);

    }

    Scanner sc = new Scanner(System.in);

    public int sessionsAttendedCredits() {
        System.out.println("No.of Sessions Attended");
        int sessionsAttended = sc.nextInt();

        if (sessionsAttended >= 30) {
            return attendanceCredits += 5;
        } else if (sessionsAttended >= 20) {
            return attendanceCredits += 3;
        } else {
            return attendanceCredits = 0;
        }
    }

    public int performanceCredits(int scores) {
        System.out.println("Performance Scores");
        int performanceScores = sc.nextInt();
        if (scores >= 85) {
            return performanceScores += 5;
        } else if (scores >= 60) {
            return performanceScores += 3;
        } else {
            return performanceScores = 0;
        }
    }

    public String achievementStatus() {
        finalCredits = attendanceCredits + performanceScores;
        if (finalCredits >= 10) {
            return "GOLD";
        } else if (finalCredits >= 8) {
            return "SILVER";
        } else {
            return "Need to Improve";
        }
    }

    int addBouns;

    public int trainerRatings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Trainers Traing (1-5)");
        trainerRatings = sc.nextInt();
        if (trainerRatings == 5) {
            return addBouns += 5000;
        } else {
            return addBouns += 0;
        }

    }
}
