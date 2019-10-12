package ru.alishev.springcource;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String[] getSong() {
        return new String[]{"Wind cries Mary", "How You Remind Me", "When We Stand Together"};
    }
}
