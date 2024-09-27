import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
    char[] studentGrades = {'A', 'B', 'C', 'D', 'F', 'B'};
    int[] studentScores = new int[studentGrades.length];
    getScores(studentGrades, studentScores);
    for (int i = 0; i < studentScores.length; i++) {
        System.out.println(studentScores[i]);
    }
}

public static void getScores(char[] grade, int[] score) {
    for (int i = 0; i < grade.length; i++) {
        if (grade[i] == 'A') {
            score[i] = 100;
        } else if (grade[i] == 'B') {
            score[i] = 90;
        } else if (grade[i] == 'C') {
            score[i] = 70;
        } else {
            score[i] = 0;
        }
    }
}
    
}
