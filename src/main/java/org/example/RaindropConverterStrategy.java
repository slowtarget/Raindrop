package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RaindropConverterStrategy {
    private RaindropConverterStrategy() {
    }

    public static String raindrop(int from, int to) {

        RaindropConverterEnum defaultStrategy = RaindropConverterEnum.DEFAULT;

        return IntStream.rangeClosed(from, to)
                .mapToObj(number -> Arrays.stream(RaindropConverterEnum.values())
                        .filter(strategy->strategy.applies(number))
                        .findFirst()
                        .map(strategy->strategy.convert(number))
                        .orElse(defaultStrategy.convert(number)))
                .collect(Collectors.joining(","));
    }
}
