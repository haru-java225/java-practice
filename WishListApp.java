import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class WishListApp {

    // 保存メソッド
    public static void saveToFile(ArrayList<String> WishList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("WishList.txt"));
            for (String stuff : WishList) {
                writer.write(stuff);
                writer.newLine(); // 見やすくするために改行
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("ファイルの保存に失敗しました。");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> WishList = new ArrayList<>();

        while (true) {
            System.out.println("1:書き込み 2:表示 3:削除 4:終了");
            System.out.println("選択してください");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("欲しいものを入力してください");
                scanner.nextLine();

                String content = scanner.nextLine();
                WishList.add(content);
                System.out.println("書き込みました！");

            } else if (choice == 2) {
                System.out.println("欲しいもの一覧");
                if (WishList.size() == 0) {
                    System.out.println("書き込みがありません");
                    continue;
                } else {
                    for (int i = 0; i < WishList.size(); i++) {
                        System.out.println((i + 1) + ":" + WishList.get(i));
                    }
                }
            } else if (choice == 3) {
                System.out.println("削除したい番号を入力してください");
                int delete = scanner.nextInt();
                if (delete < 1 || delete > WishList.size()) {
                    System.out.println("無効な番号です");
                } else {
                    WishList.remove(delete - 1);
                    System.out.println("削除しました！");
                }
            } else if (choice == 4) {
                System.out.println("終了します");
                saveToFile(WishList);
                break;

            }

        }
        scanner.close();
    }
}
