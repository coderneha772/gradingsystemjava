import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        // create scanner class object
        Scanner sc = new Scanner(System.in);
        // prompt user to enter his/her mark
        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();
        // display grade
        System.out.println("Your grade is " + findGrade(mark));
    }

    public static String findGrade(int mark) 
    {
        String grade;
        if (mark >= 80)
            grade = "A";
        else if (mark >= 70)
            grade = "B";
        else if (mark >= 60)
            grade = "C";
        else if (mark >= 50)
            grade = "D";
        else
            grade = "F";
        return grade;
    }

}