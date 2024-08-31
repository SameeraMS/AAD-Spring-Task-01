package org.example.foods;

import org.example.contract.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements Food {

    @Override
    public void eat() {
        System.out.println("eating FishBun");
    }
}
