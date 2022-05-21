package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void calcCount(int first, int second, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqrAmount(first, second);
        Assertions.assertEquals(expected, actual);
    }
}