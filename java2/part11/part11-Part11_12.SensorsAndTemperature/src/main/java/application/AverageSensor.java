/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor( Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        for( Sensor sensor: sensors) {
            if( !sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for( Sensor sensor: sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for( Sensor sensor: sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if( !this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off, or no sensors");
        }
        int total = 0;
        int count = this.sensors.size();
        
        for( Sensor sensor: sensors) {
            total += sensor.read();
        }
        
        //as return is int, we are doing int division, 
        //and the average is rounded down 
        int average =  total / count;
        this.readings.add(average);
        return average;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
