import java.util.Scanner;

class Student {
    
    String studentName;
    String rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    
    public Student(String studentName, String rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    
    public boolean checkEligibility() {
        return this.marks >= 50;
    }

    
    public double calculateFee() {
        return this.courseCredits * 1500.0;
    }

    
    public double calculateScholarship() {
        double totalFee = calculateFee();
        if (this.marks >= 85) {
            return totalFee * 0.20; 
        } else if (this.marks >= 70) {
            return totalFee * 0.10;
        } else {
            return 0.0; 
        }
    }

    
    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    
    public void displayDetails() {
        System.out.println("\n--- Student Registration Details ---");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Marks             : " + marks);
        System.out.println("Course Name       : " + courseName);
        System.out.println("Course Credits    : " + courseCredits);
        System.out.println("Eligibility Status: Eligible");
        System.out.println("Total Course Fee  : Rs. " + calculateFee());
        System.out.println("Scholarship Amount: Rs. " + calculateScholarship());
        System.out.println("Final Fee to Pay  : Rs. " + calculateFinalFee());
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNum = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        

        System.out.print("Enter Course Name: ");
        String cName = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        
        Student student = new Student(name, rollNum, marks, cName, credits);

        
        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nStudent is NOT eligible for registration (Marks are below 50).");
        }

        sc.close();
    }
}