package org.example.foods;

import org.example.contract.Food;
import org.example.custom.LastFavourit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("chickenRoll")
@LastFavourit
public class ChickenRoll implements Food {

    @Override
    public void eat() {
        System.out.println("Eating chicken roll");
    }
}
