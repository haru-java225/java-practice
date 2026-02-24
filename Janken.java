public class Janken {
    public static void main(String[] args) {
        int player = (int) (Math.random() * 3);
        int enemy = (int) (Math.random() * 3);

        if (player == 0) {
            System.out.println("あなた：グー");
        } else if (player == 1) {
            System.out.println("あなた：チョキ");
        } else {
            System.out.println("あなた：パー");
        }

        if (enemy == 0) {
            System.out.println("相手：グー");
        } else if (enemy == 1) {
            System.out.println("相手：チョキ");
        } else {
            System.out.println("相手：パー");
        }

        if (player == 0 && enemy == 1) {
            System.out.println("あなたの勝ち！");
        }
        if (player == 1 && enemy == 2) {
            System.out.println("あなたの勝ち！");
        }
        if (player == 2 && enemy == 0) {
            System.out.println("あなたの勝ち！");
        }

        if (enemy == 0 && player == 1) {
            System.out.println("あなたの負け！");
        }
        if (enemy == 1 && player == 2) {
            System.out.println("あなたの負け！");
        }
        if (enemy == 2 && player == 0) {
            System.out.println("あなたの負け！");
        }
        if (player == enemy) {
            System.out.println("あいこ！");
        }
    }
}
