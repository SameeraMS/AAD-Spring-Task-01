package org.example.customer;

import jakarta.annotation.PostConstruct;
import org.example.contract.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {

    @Autowired
    @Qualifier("chickenRoll")
    private Food food;

    public void setFood(Food food){
        this.food = food;
    }

    @PostConstruct
    public void init(){
        food.eat();
    }

}
