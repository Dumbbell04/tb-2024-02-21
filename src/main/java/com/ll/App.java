package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {
    Scanner in;
    int wisenum;
    int Deleteid = 0;
    List<Wisesaying> wisesayings;


    App() {
        in = new Scanner(System.in);
        wisenum = 0;
        wisesayings = new ArrayList<>();
    }

    void run() {

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");

            String 명령어 = in.nextLine();
            System.out.println("입력받은 명령어) " + 명령어);
            if (명령어.equals("종료")) {
                break;
            } else if (명령어.equals("등록")) {
                actionWrite();

            } else if (명령어.equals("목록")) {
                actionList();

            } else if (명령어.equals("삭제")) {
                actionDelete();

            }

        }
    }

    void actionWrite() {
        System.out.print("명언 : ");
        String 명언등록 = in.nextLine();
        String content = 명언등록;

        System.out.print("작가 : ");
        String 작가등록 = in.nextLine();
        String authorName = 작가등록;

        wisenum++;
        int id = wisenum;

        System.out.println(wisenum + "번 명언이 등록되었습니다.");
        Wisesaying wisesaying = new Wisesaying(id, content, authorName);
        wisesayings.add(wisesaying);

    }

    void actionList() {
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

    void actionDelete() {
        System.out.println("삭제할 명언의 ID를 입력하세요 : ");
        int deleteId = in.nextInt();



        for (int i = 0; i < wisesayings.size(); i++) {
            Wisesaying wisesaying = wisesayings.get(i); //이 부분에서 i에 해당하는 위치에 있는 Wisesaying 객체를 가져와서 wisesaying이라는 변수에 할당하는 것
            if (wisesaying.id == deleteId) { //여기서 변수에 할당됐을때 입력받은 deleteId와 i에 해당하는 위치에서의 wisesaying.id가 동일하면,
                wisesayings.remove(i);       //그 wisesayings(i)에 해당하는 부분을 전부 삭제한다.
                System.out.println(wisesaying.id + "번 명언이 삭제되었습니다.");

            }
        }
    }
}

