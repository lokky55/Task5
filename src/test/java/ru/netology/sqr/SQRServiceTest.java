package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10,99,5",
            "0,99,5",
            "10,10,1",
            "10,50,5",
            "10,100,5",
            "9,99,5",
            "99,99,0"
    })
    public void test(int first, int second, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqrAmount(first, second);

        Assertions.assertEquals(expected, actual);

    }
}