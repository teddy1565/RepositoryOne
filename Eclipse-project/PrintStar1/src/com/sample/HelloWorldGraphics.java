package com.sample;

import static java.lang.System.out;

public class HelloWorldGraphics {

    public static void main(String[] args) {
        int count = 5;
        out.printf("請畫三角形%n");
        drawTriangle1(count);
        drawTriangle2(count);

        out.printf("畫的還不錯！%n");
    }

    private static void drawTriangle2(int count) {
        out.printf("%n");
        out.printf("第二種三角形%n");
        // 影印第二種三角形的關鍵就在於，
        // 左邊要加印空格，
        // 最上面一行空格數最多，
        // 在往下一行減少一個空格，其餘依此類推。
        for (int i = 1; i <= count; i++) {
            for (int j = (count - i); j >= 1; j--) {
                out.printf(" ");
            }
            for (int j = 1; j <= i; j++) {
                out.printf("*");
            }
            out.printf("%n");
        }
    }

    private static void drawTriangle1(int count) {
        out.printf("%n");
        out.printf("第一種三角形%n");
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                out.printf("*");
            }
            out.printf("%n");
        }
    }
}
