package com.bulochkin.calculator.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CalculatorMinusService {
    public String getResponse(int num1, int num2){
        log.info("Get request: /calculator/minus");
        return num1+" - "+num2+" = "+(num1-num2);
    }
}
