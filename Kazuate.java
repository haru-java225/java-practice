public class Kazuate {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 50 + 1);
        int guess = (int) (Math.random() * 50 + 1);

        if (guess > answer) {
            System.out.println("大きい！");
        } else if (guess < answer) {
            System.out.println("小さい！");
        } else {
            System.out.println("正解！");
        }

        System.out.println("予想は" + guess);
        System.out.println("答えは" + answer);
    }

}
