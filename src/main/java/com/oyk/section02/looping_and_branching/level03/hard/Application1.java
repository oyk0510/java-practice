package com.oyk.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2보다 큰 정수 하나 입력하세요 : ");
        int n = sc.nextInt();

        if(n <= 2) {
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        } else {
            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("소수다.");
            }else {
                System.out.println("소수가 아니다.");
            }
        }
    }
}
