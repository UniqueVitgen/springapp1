package ru.alishev.springcource;

public class JazzMusic implements Music {
    @Override
    public String[] getSong() {
        return new String[]{"And now, the end is near\n" +
                "And so I face the final curtain", };
    }
}
