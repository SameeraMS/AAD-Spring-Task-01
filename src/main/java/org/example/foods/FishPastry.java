package org.example.foods;

import org.example.contract.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements Food {
    @Override
    public void eat() {
        System.out.println("eating Fish Pastry");
    }
}
