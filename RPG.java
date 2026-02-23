public class RPG {
    public static void main(String[] args) {
        int hit = (int) (Math.random() * 50 + 1);
        if (hit < 25) { // 出た目が25未満
            System.out.println(hit + "ダメージを与えた！");
        } else { // 出た目が25以上
            System.out.println("クリティカルヒットで100ダメージを与えた！");
        }

        int add = (int) (Math.random() * 2 + 1);
        if (add == 1) { // 振ったサイコロの目が1のとき
            System.out.println("追撃に成功した！20ダメージを与えた！");
        } else { // 振ったサイコロの目が2のとき
            System.out.println("追撃に失敗した！");
        }
    }
}
