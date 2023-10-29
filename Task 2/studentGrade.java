import java.util.Scanner;
public class studentGrade {
    public static void main(String[] args) {
      try {
        // Taking Student Input According his/her number of subjects
        Scanner studentInput = new Scanner(System.in);
        System.out.print("Enter the Number of Subjects : ");
        int totalSubjects = studentInput.nextInt();

        // Assign Students Marks
        int totalMarks = 0;

        for (int i = 1; i <= totalSubjects; i++) {

            // Taking Student Marks and Adding in totalMarks
            System.out.print("Enter Your Marks out of 100 in Subject " + i + ": ");
            int marks = studentInput.nextInt();
            totalMarks += marks;

        }

        double studentPercentage = (double)totalMarks / (totalSubjects * 100) * 100;

        char grade;
        if (studentPercentage >= 90) {
            grade = 'A';
        } else if (studentPercentage >= 80) {
            grade = 'B';
        } else if (studentPercentage >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("*---------------------------*");
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Total Percentage : " + studentPercentage);
        System.out.println("Your Grade is : " + grade);
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }   
}
