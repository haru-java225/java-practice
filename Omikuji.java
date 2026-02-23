public class Omikuji {
    public static void main(String[] args) {
        int Omikuji = (int) (Math.random() * 10 + 1);
        if (Omikuji == 1) {
            System.out.println("大吉");
        } else if (Omikuji == 2) {
            System.out.println("中吉");
        } else if (Omikuji <= 4) {
            System.out.println("小吉");

        } else {
            System.out.println("凶");
        }
    }
}
