package org.example;

import org.junit.jupiter.api.Test;

import static org.example.RaindropConverterStrategy.raindrop;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//divisible by 3, 5 and 7
//3 = Pling (or contains a 3)
//5 = Plang
//7 = Plong
//3 and 5 = PlingPlang
//3 and 7 = PlingPlong
//5 and 7 = PlangPlong
//3, 5 and 7 = PlingPlangPlong

public class RaindropConverterStrategyTest {

    @Test
    public void oneNumber() {
        assertThat(raindrop(1, 1), equalTo("1"));
    }

    @Test
    public void twoNumbers() {
        assertThat(raindrop(1, 2), equalTo("1,2"));
    }

    @Test
    public void threeNumbers() {
        assertThat(raindrop(1, 3), equalTo("1,2,Pling"));
    }

    @Test
    public void fiveNumbers() {
        assertThat(raindrop(1, 5), equalTo("1,2,Pling,4,Plang"));
    }

    @Test
    public void sixNumbers() {
        assertThat(raindrop(1, 6), equalTo("1,2,Pling,4,Plang,Pling"));
    }

    @Test
    public void tenNumbers() {
        assertThat(raindrop(1, 10), equalTo("1,2,Pling,4,Plang,Pling,Plong,8,Pling,Plang"));
    }

    @Test
    public void ThirteenNumbers() {
        assertThat(raindrop(1, 13), equalTo("1,2,Pling,4,Plang,Pling,Plong,8,Pling,Plang,11,Pling,Pling"));
    }

    @Test
    public void fifteenNumbers() {
        assertThat(raindrop(1, 15), equalTo("1,2,Pling,4,Plang,Pling,Plong,8,Pling,Plang,11,Pling,Pling,Plong,PlingPlang"));
    }

//    @Test
//    public void TwentyThreeNumbers() {
//        assertThat(raindrop(1, 23), equalTo("1,2,Pling,4,Plang,Pling,7,8,Pling,Plang,11,Pling,Pling,14,PlingPlang,16,17,Pling,19,Plang,PlingPlong,22,Pling"));
//    }





//
//    @Test
//    public void ThirteenNumbers() {
//        assertThat(raindrop(1, 13), equalTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz"));
//    }
//
//    @Test
//    public void TwentyThreeNumbers() {
//        assertThat(raindrop(1, 23), equalTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz,14,raindrop,16,17,Fizz,19,Buzz,Fizz,22,Fizz"));
//    }
//
//    @Test
//    public void FiftyOneNumbers() {
//        assertThat(raindrop(56, 56), equalTo("Buzz"));
//    }
//
//    @Test
//    public void FiftyThreeNumbers() {
//        assertThat(raindrop(53, 53), equalTo("raindrop"));
//    }
}
