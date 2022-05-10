/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
import java.util.ArrayList;

//class that stores grades in an array
//when given an array of points will convert them to grades 
//can print a distribution of grades 

public class Grades {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> tally;
    private int numGrades;
     
    public Grades(int numGrades) {
        this.numGrades = numGrades;
        this.grades = new ArrayList<>();
        this.tally = new ArrayList<>();
            for( int i = 0; i < numGrades; i ++) {
                tally.add(0);
            }

    }

    public void pointsToGrade(ArrayList<Integer> pointsList) {

        ArrayList<Integer> grades = new ArrayList<>();

        for (Integer points : pointsList) {
            int grade = 0;

            if (points < 50) {
                grade = 0;
            } else if (points < 60) {
                grade = 1;
            } else if (points < 70) {
                grade = 2;
            } else if (points < 80) {
                grade = 3;
            } else if (points < 90) {
                grade = 4;
            } else if (points >= 90) {
                grade = 5;
            }

            this.grades.add(grade);

        }
    }

    public int getTotal( int value) {
        int total = 0;
        for( Integer grade: grades) {
            if ( grade == value) {
                total += 1;
            }
        }
        return total;
    }
    
    public String stars( int num) {
        String stars = "";
        for( int i = 0; i < num; i ++) {
            stars += "*";
        }
            
        return stars;
    }
    
    public void printGrades() {
        System.out.println("Grade disctribution");
        for( int i = 5; i >= 0; i --) {
            System.out.println(i + ": " + stars(getTotal(i)) );
        }
    }

}
