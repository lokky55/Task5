package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "200,400,6",
            "200,500,8",
            "100,200,5",
            "100,100,1",
    })
    public void test(int first, int second, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqrAmount(first, second);

        Assertions.assertEquals(expected, actual);

    }
}