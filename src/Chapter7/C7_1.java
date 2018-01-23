package Chapter7;

import java.util.Scanner;

/**
 * Program to assign grades to inputs
 *
 * @author Jacob Hansen
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int Grades[] = new int[input.nextInt()];

        System.out.print("Enter " + Grades.length + " scores: ");
        for (int i = 0; i < Grades.length; i++) {
            Grades[i] = input.nextInt();
        }

        int best = Grades[0];
        for (int i = 1; i < Grades.length; i++) {
            if (Grades[i] > best) {
                best = Grades[i];
            }
        }

        char LetterGrade[] = new char[5];
        LetterGrade[0] = 'A';
        LetterGrade[1] = 'B';
        LetterGrade[2] = 'C';
        LetterGrade[3] = 'D';
        LetterGrade[4] = 'F';
        char StuLetGrade[] = new char[Grades.length];
        for (int i = 0; i < Grades.length; i++) {
            if (Grades[i] >= best - 10) {
                StuLetGrade[i] = LetterGrade[0];
            } else if (Grades[i] >= best - 20) {
                StuLetGrade[i] = LetterGrade[1];
            } else if (Grades[i] >= best - 30) {
                StuLetGrade[i] = LetterGrade[2];
            } else if (Grades[i] >= best - 40) {
                StuLetGrade[i] = LetterGrade[3];
            } else {
                StuLetGrade[i] = LetterGrade[4];
            }
        }
        for (int i = 0; i < Grades.length; i++) {
            System.out.println("Student " + i + " Score is " + Grades[i]
                    + " and Grade is " + StuLetGrade[i]);
        }
    }
}
