public class EscapeGame {
    public static void main(String[] args) {
        int player = 0; // あなたの位置
        int enemy = 0; // あいての位置
        int turn = 0; // ターン数

        System.out.println("レース開始！");

        while (player < 30 && enemy < 30) {
            turn++;
            System.out.println("[" + turn + "ターン目");

            // あなたの進む距離
            int playerMove = (int) (Math.random() * 6 + 1);
            player = player + playerMove;
            System.out.println("あなたは" + playerMove + "マス進んだ！");

            // あいての進む距離
            int enemyMove = (int) (Math.random() * 6 + 1);
            enemy = enemy + enemyMove;
            System.out.println("あいては" + enemyMove + "マス進んだ！");

            // 現在の位置表示
            System.out.println("現在位置→あなた：" + player + "あいて：" + enemy);
        }

        // 勝敗判定
        if (player >= 30 && enemy >= 30) {
            System.out.println("[結果]同時にゴール！引き分け！");

        } else if (player >= 30) {
            System.out.println("[結果]あなたの勝ち！");

        } else {
            System.out.println("[結果]あいての勝ち！");
        }

        System.out.println("レース終了！お疲れさまでした！");

    }
}
