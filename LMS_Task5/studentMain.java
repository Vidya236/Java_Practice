package LMS_Task5;

import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        System.out.println("Enter details for Student 1:");
        System.out.println("Name: ");
        student1.sname = sc.nextLine();
        System.out.print("Mobile: ");
        student1.smobile = sc.nextLine();
        System.out.println("Age: ");
        student1.sage = sc.nextByte();
        sc.nextLine();
        System.out.println("Course: ");
        student1.scourse = sc.nextLine();

        Student student2 = new Student();
        System.out.println("\nEnter details for Student 2:");
        System.out.println("Name: ");
        student2.sname = sc.nextLine();
        System.out.print("Mobile: ");
        student2.smobile = sc.nextLine();
        System.out.println("Age: ");
        student2.sage = sc.nextByte();
        sc.nextLine();
        System.out.println("Course: ");
        student2.scourse = sc.nextLine();

        // trainer
        Trainer trainer = new Trainer();
        System.out.println("Trainer Name: ");
        trainer.tname = sc.nextLine();
        System.out.println("Trainer Experience: ");
        trainer.texperience = sc.nextInt();
        sc.nextLine();
        System.out.println("Course");
        trainer.tcourse = sc.nextLine();

        // course
        Course course = new Course();
        System.out.println("Course Name: ");
        course.ctitle = sc.nextLine();
        System.out.println("Course Duration: ");
        course.cduration = sc.nextInt();
        sc.nextLine();
        System.out.println("Trainer Name: ");
        course.tname = sc.nextLine();

        System.out.println("\nStudent 1 Details:");
        student1.displayStudentDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayStudentDetails();

        System.out.println("\nTrainer Details:");
        trainer.displayTrainerDetails();

        System.out.println("\nCourse Details:");
        course.courseDetails();

        sc.close();
    }

}
