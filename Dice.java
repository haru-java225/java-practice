public class Dice {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 6 + 1);
        System.out.println("出た目は" + number + "です");
    }
}