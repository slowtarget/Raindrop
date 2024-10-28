package org.example;

import java.util.Arrays;

public class RaindropConverter {
    public String convert(int number) {
        RaindropConverterEnum defaultStrategy = RaindropConverterEnum.DEFAULT;

        return Arrays.stream(RaindropConverterEnum.values())
                        .filter(strategy->strategy.applies(number))
                        .findFirst()
                        .map(strategy->strategy.convert(number))
                        .orElse(defaultStrategy.convert(number));
    }
}
