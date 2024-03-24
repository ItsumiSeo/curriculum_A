package Curriculum_New_1_18;

import java.util.Random;

public class Curriculum_New_1_18{
    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
    public static void M1(String a, int b) {
        System.out.println("Hello JavaSE 11");
    }

    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
    public static void M2(int a, int b) {
        System.out.println(a * b);
    }

    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
    public static void M3(int[] a) {
        for (int b : a) {
            System.out.println(b);
        }
    }

    // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
    public static void M2(double a, double b) {
        System.out.println(a + b);
    }

    // Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
    // 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
    // ※0は出力＆格納しないようにしてください。
    public static int[] M5(int a) {
        int[] b = new int[a];
        Random rnd = new Random();
        for (int i = 0; i < a; i++) {
            b[i] = rnd.nextInt(100) + 1;
            System.out.println(b[i]);
        }
        return b;
    }

    // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
    // ※小数点以下も表示されるようにしてください。
    public static double M6(int[] a) {
        double ave = 0;
        for (int b : a) {
            ave += b;
        }
        ave /= a.length;
        System.out.println(ave);
        return ave;
    }

    // Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    public static boolean M7(double a) {
        return a >= 50 ? true : false;
    }

    public static void main(String[] args) {
        // 作成したメソッドをここで呼び出してください
        M1("hoge", 20);
        M2(10, 20);
        int[] a = {1, 2, 3, 4, 5};
        M3(a);
        M2(1.2, 3.4);
        int[] b = M5(5);
        double c = M6(b);
        System.out.println(M7(c));
    }
}