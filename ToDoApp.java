import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) { // 終了するまでずっと繰り返す(無限ループ)
            System.out.println("1:追加 2:表示 3:削除 4:終了");
            System.out.println("選択してください");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("タスクを入力してください");

                scanner.nextLine(); // 改行対策
                String task = scanner.nextLine();

                tasks.add(task);
                System.out.println("追加しました！");

            } else if (choice == 2) {
                System.out.println("タスク一覧");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ":" + tasks.get(i));
                }

            } else if (choice == 3) {
                if (tasks.size() == 0) {
                    System.out.println("削除するタスクがありません");
                    continue; // ループの先頭に戻る
                }
                System.out.println("削除したい番号を入力してください");
                int deleteIndex = scanner.nextInt();

                if (deleteIndex >= 1 && deleteIndex <= tasks.size()) {
                    tasks.remove(deleteIndex - 1);
                    System.out.println("削除しました!");

                } else {
                    System.out.println("その番号は存在しません");
                }

            } else if (choice == 4) {
                System.out.println("終了します");
                break; // ループ抜ける
            } else {
                System.out.println("正しい番号を入力してください");
            }

        }
        scanner.close();
    }
}