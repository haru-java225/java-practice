import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class PasswordApp {

    // 保存メソッド
    public static void saveToFile(ArrayList<String> passwords) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("password.txt"));
            for (String data : passwords) {
                writer.write(data);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("ファイルの保存に失敗しました");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // リスト（複数）だから複数形にする
        ArrayList<String> passwords = new ArrayList<>();

        while (true) {
            System.out.println("1:登録 2:表示 3:削除 4:終了");
            System.out.println("選択してください");

            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine(); // Enter対策

                System.out.println("サイト名を入力してください");
                String site = scanner.nextLine();

                System.out.println("パスワードを入力してください");
                String password = scanner.nextLine(); // ← 単数にする

                String data = site + " : " + password; // ← こっちを使う

                passwords.add(data); // ← リストに追加

                System.out.println("登録しました！");
            } else if (choice == 2) {
                if (passwords.size() == 0) {
                    System.out.println("データがありません");

                } else {
                    System.out.println("一覧");
                    for (int i = 0; i < passwords.size(); i++) {
                        System.out.println((i + 1) + ":" + passwords.get(i));

                    }
                }
            } else if (choice == 3) {
                if (passwords.size() == 0) {
                    System.out.println("削除するデータがありません");
                } else {
                    System.out.println("削除したい番号を入力してください");
                    int num = scanner.nextInt();

                    if (num < 1 || num > passwords.size()) {
                        System.out.println("無効な番号です");
                        continue;

                    } else {
                        passwords.remove(num - 1);
                        System.out.println("削除しました！");
                    }

                }
            } else if (choice == 4) {
                saveToFile(passwords);
                System.out.println("終了します");
                break;
            }

        }
        scanner.close();

    }

}
