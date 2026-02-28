public class Slot {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 3 + 1);
        int b = (int) (Math.random() * 3 + 1);
        int c = (int) (Math.random() * 3 + 1);

        System.out.println(a + "" + b + "" + c);

        if (a == b && b == c) {
            System.out.println("大当たり！");
        } else if (a == b || b == c || a == c) {
            System.out.println("当たり！");
        } else {
            System.out.println("はずれ！");
        }
    }
}
