package Curriculum_New_1_18;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {
	private static Random random = new Random();

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	String hello = "Hello JavaSE";
	int number = 11;
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	static void q2(int a, int b) {
		System.out.println(a * b);
		}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	static void q3(int[] arr){
		int[] number1 = {10,20,30};
		method(number1);
	}
	private static void method(int[] arr){
		for(int i : arr){
			System.out.println(i);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	static void q2(double a, double b) {
		System.out.println(a + b);
		}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	static int[] q5(int length) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
		array[i] = random.nextInt(99) + 1;
		}
		System.out.println(Arrays.toString(array));
		return array;
		}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	static double q6(int[] array) {
		double avg = Arrays.stream(array).average().getAsDouble();
		System.out.println(Arrays.stream(array).average().getAsDouble());
		return avg;
		}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	static boolean q7(double avg) {
		boolean q5 = avg > 50;
		System.out.println(q5);
		return q5;
		}
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		q2(random.nextInt(99) + 1, random.nextInt(99) + 1);
		q2(random.nextDouble(99) + 1, random.nextDouble(99) + 1);
		System.out.println(q7(q6(q5(random.nextInt(99) + 1))));
	}
}