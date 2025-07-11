package com.company.manufacture.Model;

import java.lang.*;
import org.springframework.stereotype.Component;

//@Component
public class Car {
    private String EngineComponent;
    private String Transmission;
    private String SteeringParts;
    private String Suspentionandbrakeparts;

    public Car
            (String engineComponent, String transmission, String steeringparts, String suspentionandbrakeparts)
    {
        this.EngineComponent=engineComponent;;
        this.Transmission=transmission;
        this.SteeringParts=steeringparts;
        this.Suspentionandbrakeparts=suspentionandbrakeparts;
    }
    public String getEngineComponent() {
        return EngineComponent;
    }
    public String getSteeringparts() {
        return SteeringParts;
    }
    public String getSuspentionandbrakeparts() {
        return Suspentionandbrakeparts;
    }
    public String getTransmission() {
        return Transmission;
    }
    public void setEngineComponent(String engineComponent) {
        EngineComponent = engineComponent;
    }
    public void setSteeringparts(String steeringparts) {
        this.SteeringParts = steeringparts;
    }
    public void setSuspentionandbrakeparts(String suspentionandbrakeparts) {
        this.Suspentionandbrakeparts = suspentionandbrakeparts;
    }
    public void setTransmission(String transmission) {
        this.Transmission = transmission;
    }
}
