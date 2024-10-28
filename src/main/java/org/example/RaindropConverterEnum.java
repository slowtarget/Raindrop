package org.example;

import java.util.stream.IntStream;

public enum RaindropConverterEnum {
    PLINGPLANGPLONG(number -> "PlingPlangPlong", isFactor(3, 5, 7)),
    PLINGPLANG(number -> "PlingPlang", isFactor(3, 5)),
    PLINGPLONG(number -> "PlingPlong", isFactor(3, 7)),
    PLANGPLONG(number -> "PlangPlong", isFactor(5, 7)),
    PLING(number -> "Pling", isFactor(3)),
    PLANG(number -> "Plang", isFactor(5)),
    PLONG(number -> "Plong", isFactor(7)),
    PLING_CONTAINING_3(number -> "Pling", number -> Number.contains(number,"3")),
    DEFAULT(String::valueOf, number -> true);

    private static Applier isFactor(int... factors) {
        return number -> IntStream.of(factors).allMatch(factor -> number % factor == 0);
    }

    private final Converter converter;
    private final Applier applier;

    RaindropConverterEnum(Converter converter, Applier applier) {
        this.converter = converter;
        this.applier = applier;
    }

    public String convert(int number) {
        return converter.convert(number);
    }

    public boolean applies(int number) {
        return applier.applies(number);
    }

    @FunctionalInterface
    interface Converter {
        String convert(int number);
    }

    @FunctionalInterface
    interface Applier {
        boolean applies(int number);
    }
}