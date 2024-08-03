/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        // Does nothing, as the sensor is always on
    }

    @Override
    public void setOff() {
        // Does nothing, as the sensor is always on
    }

    @Override
    public int read() {
        return value;
    }
}
