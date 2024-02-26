package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {
    Scanner in = new Scanner(System.in);

    void run() {

        System.out.println("== 명언 앱 ==");
        int wisenum = 0;

        List<Wisesaying> wisesayings = new ArrayList<>();
        while (true) {
            System.out.print("명령) ");

            String 명령어 = in.nextLine();
            System.out.println("입력받은 명령어) " + 명령어);
            if (명령어.equals("종료")) {
                break;
            } else if (명령어.equals("등록")) {


                System.out.print("명언 : ");
                String 명언등록 = in.nextLine();
                String content = 명언등록;

                System.out.print("작가 : ");
                String 작가등록 = in.nextLine();
                String authorName = 작가등록;
                System.out.println("명언) " + 명언등록);
                System.out.println("작가) " + 작가등록);
                wisenum++;
                int id = wisenum;

                System.out.println(wisenum + "번 명언이 등록되었습니다.");
                Wisesaying wisesaying = new Wisesaying(id, content, authorName);
                wisesayings.add(wisesaying);
            } else if (명령어.equals("목록")) {
                System.out.println("번호 / 작가 / 명언 ");
                System.out.println("----------------------");

                if (wisesayings.isEmpty()) {
                    System.out.println("등록된 명언이 없습니다.");
                }
                for (int i = wisesayings.size() - 1; i >= 0; i--) {
                    Wisesaying wisesaying = wisesayings.get(i);
                    System.out.printf("%d / %s / %s\n", wisesaying.id, wisesaying.content, wisesaying.authorName);
                }
            }

        }
    }
}

