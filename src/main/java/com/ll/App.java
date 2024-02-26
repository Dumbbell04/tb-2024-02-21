package com.ll;

import java.util.Scanner;

class App {
    Scanner in = new Scanner(System.in);
    String[] 명언등록 = new String[100];
    String[] 작가등록 = new String[100];

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
                명언등록[wisenum] = in.nextLine();
                System.out.print("작가 : ");
                작가등록[wisenum] = in.nextLine();

                System.out.println("명언) " + 명언등록[wisenum]);
                System.out.println("작가) " + 작가등록[wisenum]);

                System.out.println(wisenum + "번 명언이 등록되었습니다.");

            } else if (명령어.equals("목록")) {
                System.out.println("번호 / 작가 / 명언 ");
                System.out.println("----------------------");

                for (int listnum = 1; listnum <= wisenum; listnum++) {
                    System.out.println(listnum + " / " + 작가등록[listnum] + " / " + 명언등록[listnum]);
                }
            }
        }
    }
}
