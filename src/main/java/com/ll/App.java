package com.ll;

import java.util.Scanner;

class App {
    Scanner in = new Scanner(System.in);


    void run() {
        int wisenum = 0;
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String 명령어 = in.nextLine();
            System.out.println("입력받은 명령어) " + 명령어);
            if (명령어.equals("종료")) {
                break;
            } else if (명령어.equals("등록")) {
                wisenum++;

                System.out.print("명언 : ");
                String 명언등록 = in.nextLine();
                System.out.print("작가 : ");
                String 작가등록 = in.nextLine();

                System.out.println("명언) " + 명언등록);
                System.out.println("작가) " + 작가등록);

                System.out.println(wisenum + "번 명언이 등록되었습니다.");

            }
        }
    }
}
