public class Money {
    public static void main(String[] args) {
        int money = 1000;
        System.out.println("ゲーム開始！所持金は" + money + "円です。");

        int count = 0;

        while (money > 0 && count < 20) {

            count = count + 1;

            int event = (int) (Math.random() * 3);

            if (event == 0) {
                money = money + 500;
                System.out.println("ミッション成功！500円ゲット！");
            } else if (event == 1) {
                money = money - 800;
                System.out.println("ミション失敗！800円失った！");

            } else if (event == 2) {
                System.out.println("何も起こらなかった。");
            }

            System.out.println("現在の所持金：" + money + "円");

        }

        if (money <= 0) {
            System.out.println("破産しました...ゲーム終了！");

        } else {
            System.out.println("20回終了！最終所持金：" + money + "円");
        }

    }
}
