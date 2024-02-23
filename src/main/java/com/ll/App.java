package com.ll;

import java.util.Scanner;

class App {
    Scanner in = new Scanner(System.in);

    void run() {
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String 명령어 = in.nextLine();
            System.out.println("입력받은 명령어) " + 명령어);
            if (명령어.equals("종료")) {
                break;
            }
        }
    }
}
