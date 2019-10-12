package ru.alishev.springcource;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String[] getSong() {
        return new String[]{"Hungarian Rhapsody", "Symphony No. 1", "Symphony No. 2"};
    }
}
