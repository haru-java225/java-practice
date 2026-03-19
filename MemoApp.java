import java.util.Scanner;
import java.util.ArrayList;

public class MemoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> memos = new ArrayList<>();

        while (true) {
            System.out.println("1:書き込み 2:表示 3:削除 4:終了");
            System.out.println("選択してください");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("メモを入力してください");
                scanner.nextLine(); // Enterキー対策
                String content = scanner.nextLine();

                memos.add(content);
                System.out.println("書き込みました！");

            } else if (choice == 2) {
                System.out.println("メモ一覧");
                if (memos.size() == 0) {
                    System.out.println("書き込みがありません");
                    continue;

                } else {
                    for (int i = 0; i < memos.size(); i++) {
                        System.out.println((i + 1) + ":" + memos.get(i));

                    }
                }
            } else if (choice == 3) {
                if (memos.size() == 0) {
                    System.out.println("削除するメモがありません");
                    continue;

                } else {
                    System.out.println("削除したい番号を入力してください");
                    int delete = scanner.nextInt();
                    if (delete >= 1 && delete <= memos.size()) {
                        memos.remove(delete - 1);
                        System.out.println("削除しました！");

                    } else {
                        System.out.println("その番号は無効です");

                    }
                    if (choice == 4) {
                        System.out.println("終了します");
                        break;
                    }
                }

            }

        }
        scanner.close();
    }
}