package ru.netology.sqr;

public class SQRService {
    public int calcSqrAmount(int first, int second) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= first && sqr <= second) {
                count++;
            }
        }
        return count;
    }
}
