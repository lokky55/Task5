package ru.netology.sqr;

public class SQRService {
    public int calcSqrAmount(int first, int second) {
        int count = 0;
        for (int i = first; i <= second; i++) {
            int sqr = i * i;
            if (sqr >= 100 && sqr <= 200) {
                count++;
            }
        }
        return count;
    }
}
