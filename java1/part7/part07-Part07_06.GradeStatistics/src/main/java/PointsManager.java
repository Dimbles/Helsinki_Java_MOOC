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
import java.util.Collections;


//class that stores points in an array, adds points,
//calculates various averages and prints them


public class PointsManager {
    
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> pass;
    private ArrayList<Integer> grades;
    
    public PointsManager() {
        this.pointsList = new ArrayList<>();
        this.pass = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addPoints(int points) {
        if( points >= 0 && points <= 100) {
            this.pointsList.add(points);
        }
        
        if( points >= 50 && points <= 100) {
            this.pass.add(points);
        }
    }
    
    public void printPoints() {
        for( Integer point: pointsList) {
            System.out.println(point);
        }
    }
    
    public double calcAveragesAll() {
        int count = pointsList.size();
        int sum = 0;
        
        for( Integer point: pointsList) {
            sum += point;
        }
        
        double average = (double) sum / count;
        
        return average;
    }
    
    public void printAverageAll() {
        System.out.println("Point average (all): " + this.calcAveragesAll());
    }
    
    public double calcAveragesPass() {
        int count = pass.size();
        int sum = 0;
        
        for( Integer point: pass) {
            sum += point;
        }
        
        double average = (double) sum / count;
        
        return average;
    }
    
    public void printAveragePass() {
        System.out.println("Point average (passing): " + this.calcAveragesPass());
    }
    
    public double passPercentage() {
        int numStudents = pointsList.size();
        int numPass = pass.size();
        
        double passPercentage = ((double) numPass / numStudents) * 100;
        
        return passPercentage;
    }
    
    public void printPassPercentage() {
        System.out.println("Pass percentage: " + this.passPercentage() );
    }
    
    public ArrayList<Integer> getPoints() {
        return this.pointsList;
    }
    
    }
    

