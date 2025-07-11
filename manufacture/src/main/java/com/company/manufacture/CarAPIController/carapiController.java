package com.company.manufacture.CarAPIController;

import com.company.manufacture.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class carapiController {
//    @Autowired
//    private Car car;
    @GetMapping("/rawmaterial")
    public Car rawMaterial(){
        return new Car("1.5 litre","gear parts","parts 562","Susbr56");
    }
    @PostMapping("/raw")
    public Car raw(@RequestBody Car carInput){
        return carInput;
    }
}

