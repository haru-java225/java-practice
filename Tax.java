public class Tax {
    public static void main(String[] args) {
        int price = (int) (Math.random() * 5000 + 1);
        System.out.println("定価" + price + "円です。");
        int discountPrice = (int) (price * 0.6);// 40%割引の計算、小数をint型にキャストしている
        System.out.println("割引価格は" + discountPrice + "円です。");
        System.out.println("税込み価格は" + (int) (price * 1.1) + "円です。"); // 小数をint型にキャストしている
        int person = (int) (Math.random() * 5 + 1);
        System.out.println("一人当たりの価格は" + discountPrice / person + "円です。");
    }

}
