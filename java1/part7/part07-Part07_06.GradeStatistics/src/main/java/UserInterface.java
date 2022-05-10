/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
import java.util.Scanner;

public class UserInterface {

    private PointsManager pointsManager;
    private Scanner scanner;
    private Grades grades;

    public UserInterface(PointsManager pointsManager, Scanner scanner, Grades grades) {
        this.pointsManager = pointsManager;
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops: ");

        while (true) {
            Integer point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                break;
            }

            pointsManager.addPoints(point);

        }

        pointsManager.printAverageAll();
        pointsManager.printAveragePass();
        pointsManager.printPassPercentage();
        grades.pointsToGrade(pointsManager.getPoints());
        grades.printGrades();

    }

}
